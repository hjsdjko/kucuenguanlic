package com.entity.model;

import com.entity.GoodsOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品预定
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品
     */
    private Integer goodsId;


    /**
     * 客户
     */
    private Integer kehuId;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 单号
     */
    private String goodsOrderDanhaoNumber;


    /**
     * 预定数量
     */
    private Integer goodsOrderNumber;


    /**
     * 预定时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date goodsOrderTime;


    /**
     * 预定状态
     */
    private Integer goodsOrderTypes;


    /**
     * 备注
     */
    private String goodsOrderContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：商品
	 */
    public Integer getGoodsId() {
        return goodsId;
    }


    /**
	 * 设置：商品
	 */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }
    /**
	 * 获取：客户
	 */
    public Integer getKehuId() {
        return kehuId;
    }


    /**
	 * 设置：客户
	 */
    public void setKehuId(Integer kehuId) {
        this.kehuId = kehuId;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：员工
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：单号
	 */
    public String getGoodsOrderDanhaoNumber() {
        return goodsOrderDanhaoNumber;
    }


    /**
	 * 设置：单号
	 */
    public void setGoodsOrderDanhaoNumber(String goodsOrderDanhaoNumber) {
        this.goodsOrderDanhaoNumber = goodsOrderDanhaoNumber;
    }
    /**
	 * 获取：预定数量
	 */
    public Integer getGoodsOrderNumber() {
        return goodsOrderNumber;
    }


    /**
	 * 设置：预定数量
	 */
    public void setGoodsOrderNumber(Integer goodsOrderNumber) {
        this.goodsOrderNumber = goodsOrderNumber;
    }
    /**
	 * 获取：预定时间
	 */
    public Date getGoodsOrderTime() {
        return goodsOrderTime;
    }


    /**
	 * 设置：预定时间
	 */
    public void setGoodsOrderTime(Date goodsOrderTime) {
        this.goodsOrderTime = goodsOrderTime;
    }
    /**
	 * 获取：预定状态
	 */
    public Integer getGoodsOrderTypes() {
        return goodsOrderTypes;
    }


    /**
	 * 设置：预定状态
	 */
    public void setGoodsOrderTypes(Integer goodsOrderTypes) {
        this.goodsOrderTypes = goodsOrderTypes;
    }
    /**
	 * 获取：备注
	 */
    public String getGoodsOrderContent() {
        return goodsOrderContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGoodsOrderContent(String goodsOrderContent) {
        this.goodsOrderContent = goodsOrderContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
