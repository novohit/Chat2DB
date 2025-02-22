package ai.chat2db.plugin.mysql;

import ai.chat2db.spi.DBManage;
import ai.chat2db.spi.sql.SQLExecutor;
import org.springframework.util.StringUtils;

import java.sql.SQLException;

public class MysqlDBManage implements DBManage {
    @Override
    public void connectDatabase(String database) {
        if (StringUtils.isEmpty(database)) {
            return;
        }
        try {
            SQLExecutor.getInstance().execute("use `" + database + "`;", null);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void modifyDatabase(String databaseName, String newDatabaseName) {

    }

    @Override
    public void createDatabase(String databaseName) {

    }

    @Override
    public void dropDatabase(String databaseName) {

    }

    @Override
    public void createSchema(String databaseName, String schemaName) {

    }

    @Override
    public void dropSchema(String databaseName, String schemaName) {

    }

    @Override
    public void modifySchema(String databaseName, String schemaName, String newSchemaName) {

    }

    @Override
    public void dropTable(String databaseName, String schemaName, String tableName) {

    }
}
