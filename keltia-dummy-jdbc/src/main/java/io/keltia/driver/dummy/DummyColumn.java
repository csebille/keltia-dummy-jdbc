package io.keltia.driver.dummy;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DummyColumn {

    String columnName;
    boolean isAutoIncrement;
    boolean isCaseSensitive;
    boolean isDefinitelyWritable;
    boolean isSigned;
    boolean isSearchable;
    boolean isCurrency;

    int columnDisplaySize;

    String schemaName;

    int precision;

    int scale;

    String tableName;

    String columnLabel;

    String catalogName;

    int columnType;

    String columnTypeName;

    boolean isReadOnly;

    boolean isWritable;

    String columnClassName;
    Object dummyValue;
    int isNullable = ResultSetMetaData.columnNoNulls;

    public DummyColumn(String columnName,
        boolean isAutoIncrement,
        boolean isCaseSensitive,
        boolean isDefinitelyWritable,
        boolean isSigned,
        boolean isSearchable,
        boolean isCurrency,
        int isNullable,
        int columnDisplaySize,
        String columnLabel,
        String schemaName,
        int precision,
        int scale,
        String tableName,
        String catalogName,
        int columnType,
        String columnTypeName,
        boolean isReadOnly,
        boolean isWritable,
        String columnClassName
    ) {
        this.columnName = columnName;
        this.isAutoIncrement = isAutoIncrement;
        this.isCaseSensitive = isCaseSensitive;
        this.isDefinitelyWritable = isDefinitelyWritable;
        this.isSigned = isSigned;
        this.isSearchable = isSearchable;
        this.isCurrency = isCurrency;
        this.isNullable = isNullable;
        this.columnDisplaySize = columnDisplaySize;
        this.columnLabel = columnLabel;
        this.schemaName = schemaName;
        this.precision = precision;
        this.scale = scale;
        this.tableName = tableName;
        this.catalogName = catalogName;
        this.columnType = columnType;
        this.columnTypeName = columnTypeName;
        this.isReadOnly = isReadOnly;
        this.isWritable = isWritable;
        this.columnClassName = columnClassName;
    }

    public boolean isAutoIncrement() throws SQLException {
        return this.isAutoIncrement;
    }

    public boolean isCaseSensitive()throws SQLException {
        return this.isAutoIncrement;
    }

    public boolean isDefinitelyWritable() throws SQLException {
        return this.isDefinitelyWritable;
    }

    public boolean isSearchable(int i) throws SQLException {
        return this.isSearchable;
    }

    public boolean isCurrency(int i) throws SQLException {
        return this.isCurrency;
    }

    public int isNullable() throws SQLException {
        return this.isNullable;
    }

    public boolean isSigned(int i) throws SQLException {
        return this.isSigned;
    }

    public int getColumnDisplaySize(int i) throws SQLException {
        return this.columnDisplaySize;
    }

    public String getColumnLabel(int i) throws SQLException {
        return this.columnLabel;
    }

    public String getColumnName(int i) throws SQLException {
        return this.columnName;
    }

    public String getSchemaName(int i) throws SQLException {
        return this.schemaName;
    }

    public int getPrecision(int i) throws SQLException {
        return this.precision;
    }

    public int getScale(int i) throws SQLException {
        return this.scale;
    }

    public String getTableName(int i) throws SQLException {
        return this.tableName;
    }

    public String getCatalogName(int i) throws SQLException {
        return this.catalogName;
    }

    public int getColumnType(int i) throws SQLException {
        return this.columnType;
    }

    public String getColumnTypeName(int i) throws SQLException {
        return this.columnTypeName;
    }

    public boolean isReadOnly(int i) throws SQLException {
        return this.isReadOnly;
    }

    public boolean isWritable(int i) throws SQLException {
        return this.isWritable;
    }

    public String getColumnClassName() {
        return dummyValue.getClass().getName();
    }
}
