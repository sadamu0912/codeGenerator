package mysql.uitl;

/**
 * <p>
 * 输出文件配置
 * </p>
 */
public abstract class FileOutConfig {

    /**
     * 模板
     */
    private String templatePath;

    public FileOutConfig() {
        // to do nothing
    }

    public FileOutConfig(String templatePath) {
        this.templatePath = templatePath;
    }

    /**
     * 输出文件
     */
    public abstract String outputFile(TableInfo tableInfo);

    public String getTemplatePath() {
        return templatePath;
    }

    public FileOutConfig setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
        return this;
    }

}
