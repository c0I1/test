package cn.timelost.hr.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * null
 * @TableName user
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    private Integer id;

    /**
     * 
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    private String username;

    /**
     * 
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    private String password;

    /**
     * 
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    private String salt;

    /**
     * 
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbg.generated 2021-02-18 19:04:09
     */
    private static final long serialVersionUID = 1L;
}