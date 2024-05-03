package com.entity.model;

import com.entity.GoodsEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GoodsModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 商品名字
     */
    private String goodsName;


    /**
     * 商品类型
     */
    private Integer goodsTypes;


    /**
     * 商品库存
     */
    private Integer goodsKucunNumber;


    /**
     * 供应商
     */
    private Integer gongyinghsangId;


    /**
     * 存储仓库
     */
    private Integer cangkuTypes;


    /**
     * 单位
     */
    private String danwei;


    /**
     * 单价
     */
    private Double goodsNewMoney;


    /**
     * 商品详情
     */
    private String goodsContent;


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
	 * 获取：商品名字
	 */
    public String getGoodsName() {
        return goodsName;
    }


    /**
	 * 设置：商品名字
	 */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**
	 * 获取：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 设置：商品类型
	 */
    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 获取：商品库存
	 */
    public Integer getGoodsKucunNumber() {
        return goodsKucunNumber;
    }


    /**
	 * 设置：商品库存
	 */
    public void setGoodsKucunNumber(Integer goodsKucunNumber) {
        this.goodsKucunNumber = goodsKucunNumber;
    }
    /**
	 * 获取：供应商
	 */
    public Integer getGongyinghsangId() {
        return gongyinghsangId;
    }


    /**
	 * 设置：供应商
	 */
    public void setGongyinghsangId(Integer gongyinghsangId) {
        this.gongyinghsangId = gongyinghsangId;
    }
    /**
	 * 获取：存储仓库
	 */
    public Integer getCangkuTypes() {
        return cangkuTypes;
    }


    /**
	 * 设置：存储仓库
	 */
    public void setCangkuTypes(Integer cangkuTypes) {
        this.cangkuTypes = cangkuTypes;
    }
    /**
	 * 获取：单位
	 */
    public String getDanwei() {
        return danwei;
    }


    /**
	 * 设置：单位
	 */
    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }
    /**
	 * 获取：单价
	 */
    public Double getGoodsNewMoney() {
        return goodsNewMoney;
    }


    /**
	 * 设置：单价
	 */
    public void setGoodsNewMoney(Double goodsNewMoney) {
        this.goodsNewMoney = goodsNewMoney;
    }
    /**
	 * 获取：商品详情
	 */
    public String getGoodsContent() {
        return goodsContent;
    }


    /**
	 * 设置：商品详情
	 */
    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
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
