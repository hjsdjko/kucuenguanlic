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
 * 商品
 *
 * @author 
 * @email
 */
@TableName("goods")
public class GoodsEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsEntity() {

	}

	public GoodsEntity(T t) {
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

    @Override
    public String toString() {
        return "Goods{" +
            "id=" + id +
            ", goodsName=" + goodsName +
            ", goodsTypes=" + goodsTypes +
            ", goodsKucunNumber=" + goodsKucunNumber +
            ", gongyinghsangId=" + gongyinghsangId +
            ", cangkuTypes=" + cangkuTypes +
            ", danwei=" + danwei +
            ", goodsNewMoney=" + goodsNewMoney +
            ", goodsContent=" + goodsContent +
            ", createTime=" + createTime +
        "}";
    }
}
