package io.keltia.driver.dummy;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.LinkedList;

public class DummyResultSetMetaData implements ResultSetMetaData {

    LinkedList<DummyColumn> colz;

    public DummyResultSetMetaData() {
        this.colz = new LinkedList<DummyColumn>();
        this.colz.add(new DummyColumn("id",
                false,
                false,
                false,
                false,
                false,
                false,
                ResultSetMetaData.columnNoNulls,
                32,
                "id",
                "",
                0,
                0,
                "dummy",
                "",
                Types.INTEGER,
                "INTEGER",
                true,
                false,
                "java.lang.Integer"));
        this.colz.add(new DummyColumn("text",
                false,
                false,
                false,
                false,
                false,
                false,
                ResultSetMetaData.columnNoNulls,
                32,
                "id",
                "",
                0,
                0,
                "dummy",
                "",
                Types.VARCHAR,
                "VARCHAR",
                true,
                false,
                "java.lang.String"));
    }

    @Override
    public int getColumnCount() throws SQLException {
        return this.colz.size();
    }

    @Override
    public boolean isAutoIncrement(int i) throws SQLException {
        return false;
    }

    @Override
    public boolean isCaseSensitive(int i) throws SQLException {
        return false;
    }

    @Override
    public boolean isSearchable(int i) throws SQLException {
        return false;
    }

    @Override
    public boolean isCurrency(int i) throws SQLException {
        return false;
    }

    @Override
    public int isNullable(int i) throws SQLException {
        return 0;
    }

    @Override
    public boolean isSigned(int i) throws SQLException {
        return false;
    }

    @Override
    public int getColumnDisplaySize(int i) throws SQLException {
        return 0;
    }

    @Override
    public String getColumnLabel(int i) throws SQLException {
        return null;
    }

    @Override
    public String getColumnName(int i) throws SQLException {
        return this.colz.get(i).columnName;
    }

    @Override
    public String getSchemaName(int i) throws SQLException {
        return null;
    }

    @Override
    public int getPrecision(int i) throws SQLException {
        return 0;
    }

    @Override
    public int getScale(int i) throws SQLException {
        return 0;
    }

    @Override
    public String getTableName(int i) throws SQLException {
        return null;
    }

    @Override
    public String getCatalogName(int i) throws SQLException {
        return null;
    }

    @Override
    public int getColumnType(int i) throws SQLException {
        return 0;
    }

    @Override
    public String getColumnTypeName(int i) throws SQLException {
        return null;
    }

    @Override
    public boolean isReadOnly(int i) throws SQLException {
        return false;
    }

    @Override
    public boolean isWritable(int i) throws SQLException {
        return false;
    }

    @Override
    public boolean isDefinitelyWritable(int i) throws SQLException {
        return false;
    }

    @Override
    public String getColumnClassName(int i) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> aClass) throws SQLException {
        return false;
    }
}
