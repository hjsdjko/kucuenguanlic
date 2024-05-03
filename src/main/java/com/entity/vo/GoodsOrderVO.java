package com.entity.vo;

import com.entity.GoodsOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品预定
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goods_order")
public class GoodsOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
