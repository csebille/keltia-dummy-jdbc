package io.keltia.driver.dummy;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;


public class DummyDriver implements Driver {

    static {
        try {
            // moved the registerDriver from the constructor to here
            // because some clients call the driver themselves (I know, as
            // my early jdbc work did - and that was based on other examples).
            // Placing it here, means that the driver is registered once only.
            register();
        } catch (SQLException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private static Driver registeredDriver;

    /**
     * Register the driver against {@link DriverManager}. This is done automatically when the class is
     * loaded. Dropping the driver from DriverManager's list is possible using {@link #deregister()}
     * method.
     *
     * @throws IllegalStateException if the driver is already registered
     * @throws SQLException          if registering the driver fails
     */
    public static void register() throws SQLException {
        System.out.println("register");
        if (isRegistered()) {
            throw new IllegalStateException(
                    "Driver is already registered. It can only be registered once.");
        }
        DriverManager.registerDriver(new DummyDriver());

        try {
            Class.forName("io.keltia.driver.dummy.DummyDriver");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * According to JDBC specification, this driver is registered against {@link DriverManager} when
     * the class is loaded. To avoid leaks, this method allow unregistering the driver so that the
     * class can be gc'ed if necessary.
     *
     * @throws IllegalStateException if the driver is not registered
     * @throws SQLException          if deregistering the driver fails
     */
    public static void deregister() throws SQLException {
        if (registeredDriver == null) {
            throw new IllegalStateException(
                    "Driver is not registered (or it has not been registered using Driver.register() method)");
        }
        DriverManager.deregisterDriver(registeredDriver);
        registeredDriver = null;
    }

    /**
     * @return {@code true} if the driver is registered against {@link DriverManager}
     */
    public static boolean isRegistered() {
        return registeredDriver != null;
    }

    @Override
    public Connection connect(String s, Properties properties) throws SQLException {
        return new DummyConnection();
    }

    @Override
    public boolean acceptsURL(String s) throws SQLException {
        System.out.println("acceptsURL");
        return s.startsWith("jdbc:keltia:dummy:");
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String s, Properties properties) throws SQLException {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 0;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return false;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
