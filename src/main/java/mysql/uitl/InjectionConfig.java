package mysql.uitl;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 抽象的对外接口
 * </p>
 */
public abstract class InjectionConfig {

    /**
     * 全局配置
     */
    private ConfigBuilder config;

    /**
     * 自定义返回配置 Map 对象
     */
    private Map<String, Object> map;

    /**
     * 自定义输出文件
     */
    private List<FileOutConfig> fileOutConfigList;

    /**
     * 注入自定义 Map 对象
     */
    public abstract void initMap();

    public ConfigBuilder getConfig() {
        return config;
    }

    public InjectionConfig setConfig(ConfigBuilder config) {
        this.config = config;
        return this;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public InjectionConfig setMap(Map<String, Object> map) {
        this.map = map;
        return this;
    }

    public List<FileOutConfig> getFileOutConfigList() {
        return fileOutConfigList;
    }

    public InjectionConfig setFileOutConfigList(List<FileOutConfig> fileOutConfigList) {
        this.fileOutConfigList = fileOutConfigList;
        return this;
    }

}
