package mysql.uitl;


/**
 * <p>
 * 字段填充策略枚举类
 * </p>
 */
public enum FieldFill {
    DEFAULT(0, "默认不处理"),
    INSERT(1, "插入填充字段"),
    UPDATE(2, "更新填充字段"),
    INSERT_UPDATE(3, "插入和更新填充字段");

    /**
     * 主键
     */
    private final int key;

    /**
     * 描述
     */
    private final String desc;

    FieldFill(final int key, final String desc) {
        this.key = key;
        this.desc = desc;
    }

    public static FieldFill getIgnore(int key) {
        FieldFill[] fis = FieldFill.values();
        for (FieldFill fi : fis) {
            if (fi.getKey() == key) {
                return fi;
            }
        }
        return FieldFill.DEFAULT;
    }

    public int getKey() {
        return this.key;
    }

    public String getDesc() {
        return this.desc;
    }

}
