package com.entity.view;

import com.entity.GoodsEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goods")
public class GoodsView extends GoodsEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 商品类型的值
		*/
		private String goodsValue;
		/**
		* 存储仓库的值
		*/
		private String cangkuValue;



		//级联表 gongyinghsang
			/**
			* 供应商名称
			*/
			private String gongyinghsangName;
			/**
			* 供应商类型
			*/
			private Integer gongyinghsangTypes;
				/**
				* 供应商类型的值
				*/
				private String gongyinghsangValue;
			/**
			* 供应商信用等级名称
			*/
			private Integer gongyinghsangXinyongTypes;
				/**
				* 供应商信用等级名称的值
				*/
				private String gongyinghsangXinyongValue;
			/**
			* 供应商详情
			*/
			private String gongyinghsangContent;

	public GoodsView() {

	}

	public GoodsView(GoodsEntity goodsEntity) {
		try {
			BeanUtils.copyProperties(this, goodsEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 商品类型的值
			*/
			public String getGoodsValue() {
				return goodsValue;
			}
			/**
			* 设置： 商品类型的值
			*/
			public void setGoodsValue(String goodsValue) {
				this.goodsValue = goodsValue;
			}
			/**
			* 获取： 存储仓库的值
			*/
			public String getCangkuValue() {
				return cangkuValue;
			}
			/**
			* 设置： 存储仓库的值
			*/
			public void setCangkuValue(String cangkuValue) {
				this.cangkuValue = cangkuValue;
			}






				//级联表的get和set gongyinghsang

					/**
					* 获取： 供应商名称
					*/
					public String getGongyinghsangName() {
						return gongyinghsangName;
					}
					/**
					* 设置： 供应商名称
					*/
					public void setGongyinghsangName(String gongyinghsangName) {
						this.gongyinghsangName = gongyinghsangName;
					}

					/**
					* 获取： 供应商类型
					*/
					public Integer getGongyinghsangTypes() {
						return gongyinghsangTypes;
					}
					/**
					* 设置： 供应商类型
					*/
					public void setGongyinghsangTypes(Integer gongyinghsangTypes) {
						this.gongyinghsangTypes = gongyinghsangTypes;
					}


						/**
						* 获取： 供应商类型的值
						*/
						public String getGongyinghsangValue() {
							return gongyinghsangValue;
						}
						/**
						* 设置： 供应商类型的值
						*/
						public void setGongyinghsangValue(String gongyinghsangValue) {
							this.gongyinghsangValue = gongyinghsangValue;
						}

					/**
					* 获取： 供应商信用等级名称
					*/
					public Integer getGongyinghsangXinyongTypes() {
						return gongyinghsangXinyongTypes;
					}
					/**
					* 设置： 供应商信用等级名称
					*/
					public void setGongyinghsangXinyongTypes(Integer gongyinghsangXinyongTypes) {
						this.gongyinghsangXinyongTypes = gongyinghsangXinyongTypes;
					}


						/**
						* 获取： 供应商信用等级名称的值
						*/
						public String getGongyinghsangXinyongValue() {
							return gongyinghsangXinyongValue;
						}
						/**
						* 设置： 供应商信用等级名称的值
						*/
						public void setGongyinghsangXinyongValue(String gongyinghsangXinyongValue) {
							this.gongyinghsangXinyongValue = gongyinghsangXinyongValue;
						}

					/**
					* 获取： 供应商详情
					*/
					public String getGongyinghsangContent() {
						return gongyinghsangContent;
					}
					/**
					* 设置： 供应商详情
					*/
					public void setGongyinghsangContent(String gongyinghsangContent) {
						this.gongyinghsangContent = gongyinghsangContent;
					}
















}
