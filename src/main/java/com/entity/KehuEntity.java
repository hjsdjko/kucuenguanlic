package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 客户
 *
 * @author 
 * @email
 */
@TableName("kehu")
public class KehuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KehuEntity() {

	}

	public KehuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 客户姓名
     */
    @TableField(value = "kehu_name")

    private String kehuName;


    /**
     * 客户联系方式
     */
    @TableField(value = "kehu_phone")

    private String kehuPhone;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 客户详情
     */
    @TableField(value = "kehu_order_content")

    private String kehuOrderContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：客户姓名
	 */
    public String getKehuName() {
        return kehuName;
    }
    /**
	 * 获取：客户姓名
	 */

    public void setKehuName(String kehuName) {
        this.kehuName = kehuName;
    }
    /**
	 * 设置：客户联系方式
	 */
    public String getKehuPhone() {
        return kehuPhone;
    }
    /**
	 * 获取：客户联系方式
	 */

    public void setKehuPhone(String kehuPhone) {
        this.kehuPhone = kehuPhone;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：客户详情
	 */
    public String getKehuOrderContent() {
        return kehuOrderContent;
    }
    /**
	 * 获取：客户详情
	 */

    public void setKehuOrderContent(String kehuOrderContent) {
        this.kehuOrderContent = kehuOrderContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kehu{" +
            "id=" + id +
            ", kehuName=" + kehuName +
            ", kehuPhone=" + kehuPhone +
            ", sexTypes=" + sexTypes +
            ", kehuOrderContent=" + kehuOrderContent +
            ", createTime=" + createTime +
        "}";
    }
}
