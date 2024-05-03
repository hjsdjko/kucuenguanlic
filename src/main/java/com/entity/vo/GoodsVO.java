package com.entity.vo;

import com.entity.GoodsEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("goods")
public class GoodsVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 商品名字
     */

    @TableField(value = "goods_name")
    private String goodsName;


    /**
     * 商品类型
     */

    @TableField(value = "goods_types")
    private Integer goodsTypes;


    /**
     * 商品库存
     */

    @TableField(value = "goods_kucun_number")
    private Integer goodsKucunNumber;


    /**
     * 供应商
     */

    @TableField(value = "gongyinghsang_id")
    private Integer gongyinghsangId;


    /**
     * 存储仓库
     */

    @TableField(value = "cangku_types")
    private Integer cangkuTypes;


    /**
     * 单位
     */

    @TableField(value = "danwei")
    private String danwei;


    /**
     * 单价
     */

    @TableField(value = "goods_new_money")
    private Double goodsNewMoney;


    /**
     * 商品详情
     */

    @TableField(value = "goods_content")
    private String goodsContent;


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
	 * 设置：商品名字
	 */
    public String getGoodsName() {
        return goodsName;
    }


    /**
	 * 获取：商品名字
	 */

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
    /**
	 * 设置：商品类型
	 */
    public Integer getGoodsTypes() {
        return goodsTypes;
    }


    /**
	 * 获取：商品类型
	 */

    public void setGoodsTypes(Integer goodsTypes) {
        this.goodsTypes = goodsTypes;
    }
    /**
	 * 设置：商品库存
	 */
    public Integer getGoodsKucunNumber() {
        return goodsKucunNumber;
    }


    /**
	 * 获取：商品库存
	 */

    public void setGoodsKucunNumber(Integer goodsKucunNumber) {
        this.goodsKucunNumber = goodsKucunNumber;
    }
    /**
	 * 设置：供应商
	 */
    public Integer getGongyinghsangId() {
        return gongyinghsangId;
    }


    /**
	 * 获取：供应商
	 */

    public void setGongyinghsangId(Integer gongyinghsangId) {
        this.gongyinghsangId = gongyinghsangId;
    }
    /**
	 * 设置：存储仓库
	 */
    public Integer getCangkuTypes() {
        return cangkuTypes;
    }


    /**
	 * 获取：存储仓库
	 */

    public void setCangkuTypes(Integer cangkuTypes) {
        this.cangkuTypes = cangkuTypes;
    }
    /**
	 * 设置：单位
	 */
    public String getDanwei() {
        return danwei;
    }


    /**
	 * 获取：单位
	 */

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }
    /**
	 * 设置：单价
	 */
    public Double getGoodsNewMoney() {
        return goodsNewMoney;
    }


    /**
	 * 获取：单价
	 */

    public void setGoodsNewMoney(Double goodsNewMoney) {
        this.goodsNewMoney = goodsNewMoney;
    }
    /**
	 * 设置：商品详情
	 */
    public String getGoodsContent() {
        return goodsContent;
    }


    /**
	 * 获取：商品详情
	 */

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
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
