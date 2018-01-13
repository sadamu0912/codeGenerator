package mysql.uitl;


import mysql.uitl.converts.DbColumnType;

/**
 * <p>
 * 数据库字段类型转换
 * </p>
 *
 * @author hubin
 * @date 2017-01-20
 */
public interface ITypeConvert {

    /**
     * <p>
     * 执行类型转换
     * </p>
     *
     * @param fieldType 字段类型
     * @return
     */
    DbColumnType processTypeConvert(String fieldType);

}
