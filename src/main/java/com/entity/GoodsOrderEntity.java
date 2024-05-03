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
 * 商品预定
 *
 * @author 
 * @email
 */
@TableName("goods_order")
public class GoodsOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsOrderEntity() {

	}

	public GoodsOrderEntity(T t) {
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
     * 商品
     */
    @TableField(value = "goods_id")

    private Integer goodsId;


    /**
     * 客户
     */
    @TableField(value = "kehu_id")

    private Integer kehuId;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 单号
     */
    @TableField(value = "goods_order_danhao_number")

    private String goodsOrderDanhaoNumber;


    /**
     * 预定数量
     */
    @TableField(value = "goods_order_number")

    private Integer goodsOrderNumber;


    /**
     * 预定时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "goods_order_time")

    private Date goodsOrderTime;


    /**
     * 预定状态
     */
    @TableField(value = "goods_order_types")

    private Integer goodsOrderTypes;


    /**
     * 备注
     */
    @TableField(value = "goods_order_content")

    private String goodsOrderContent;


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
	 * 设置：商品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }
    /**
	 * 获取：商品
	 */

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 设置：客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }
    /**
	 * 获取：客户
	 */

    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：单号
	 */
    public String getGoodsOrderDanhaoNumber() {
        return goodsOrderDanhaoNumber;
    }
    /**
	 * 获取：单号
	 */

    public void setGoodsOrderDanhaoNumber(String goodsOrderDanhaoNumber) {
        this.goodsOrderDanhaoNumber = goodsOrderDanhaoNumber;
    }
    /**
	 * 设置：预定数量
	 */
    public Integer getGoodsOrderNumber() {
        return goodsOrderNumber;
    }
    /**
	 * 获取：预定数量
	 */

    public void setGoodsOrderNumber(Integer goodsOrderNumber) {
        this.goodsOrderNumber = goodsOrderNumber;
    }
    /**
	 * 设置：预定时间
	 */
    public Date getGoodsOrderTime() {
        return goodsOrderTime;
    }
    /**
	 * 获取：预定时间
	 */

    public void setGoodsOrderTime(Date goodsOrderTime) {
        this.goodsOrderTime = goodsOrderTime;
    }
    /**
	 * 设置：预定状态
	 */
    public Integer getGoodsOrderTypes() {
        return goodsOrderTypes;
    }
    /**
	 * 获取：预定状态
	 */

    public void setGoodsOrderTypes(Integer goodsOrderTypes) {
        this.goodsOrderTypes = goodsOrderTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getGoodsOrderContent() {
        return goodsOrderContent;
    }
    /**
	 * 获取：备注
	 */

    public void setGoodsOrderContent(String goodsOrderContent) {
        this.goodsOrderContent = goodsOrderContent;
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
        return "GoodsOrder{" +
            "id=" + id +
            ", goodsId=" + goodsId +
            ", kehuId=" + kehuId +
            ", yonghuId=" + yonghuId +
            ", goodsOrderDanhaoNumber=" + goodsOrderDanhaoNumber +
            ", goodsOrderNumber=" + goodsOrderNumber +
            ", goodsOrderTime=" + goodsOrderTime +
            ", goodsOrderTypes=" + goodsOrderTypes +
            ", goodsOrderContent=" + goodsOrderContent +
            ", createTime=" + createTime +
        "}";
    }
}
