package com.entity.view;

import com.entity.GoodsOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 商品预定
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("goods_order")
public class GoodsOrderView extends GoodsOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 预定状态的值
		*/
		private String goodsOrderValue;



		//级联表 goods
			/**
			* 商品名字
			*/
			private String goodsName;
			/**
			* 商品类型
			*/
			private Integer goodsTypes;
				/**
				* 商品类型的值
				*/
				private String goodsValue;
			/**
			* 商品库存
			*/
			private Integer goodsKucunNumber;
			/**
			* 存储仓库
			*/
			private Integer cangkuTypes;
				/**
				* 存储仓库的值
				*/
				private String cangkuValue;
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

		//级联表 kehu
			/**
			* 客户姓名
			*/
			private String kehuName;
			/**
			* 客户联系方式
			*/
			private String kehuPhone;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 客户详情
			*/
			private String kehuOrderContent;

		//级联表 yonghu
			/**
			* 员工姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public GoodsOrderView() {

	}

	public GoodsOrderView(GoodsOrderEntity goodsOrderEntity) {
		try {
			BeanUtils.copyProperties(this, goodsOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 预定状态的值
			*/
			public String getGoodsOrderValue() {
				return goodsOrderValue;
			}
			/**
			* 设置： 预定状态的值
			*/
			public void setGoodsOrderValue(String goodsOrderValue) {
				this.goodsOrderValue = goodsOrderValue;
			}












				//级联表的get和set goods

					/**
					* 获取： 商品名字
					*/
					public String getGoodsName() {
						return goodsName;
					}
					/**
					* 设置： 商品名字
					*/
					public void setGoodsName(String goodsName) {
						this.goodsName = goodsName;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getGoodsTypes() {
						return goodsTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setGoodsTypes(Integer goodsTypes) {
						this.goodsTypes = goodsTypes;
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
					* 获取： 商品库存
					*/
					public Integer getGoodsKucunNumber() {
						return goodsKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setGoodsKucunNumber(Integer goodsKucunNumber) {
						this.goodsKucunNumber = goodsKucunNumber;
					}


					/**
					* 获取： 存储仓库
					*/
					public Integer getCangkuTypes() {
						return cangkuTypes;
					}
					/**
					* 设置： 存储仓库
					*/
					public void setCangkuTypes(Integer cangkuTypes) {
						this.cangkuTypes = cangkuTypes;
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

					/**
					* 获取： 单位
					*/
					public String getDanwei() {
						return danwei;
					}
					/**
					* 设置： 单位
					*/
					public void setDanwei(String danwei) {
						this.danwei = danwei;
					}

					/**
					* 获取： 单价
					*/
					public Double getGoodsNewMoney() {
						return goodsNewMoney;
					}
					/**
					* 设置： 单价
					*/
					public void setGoodsNewMoney(Double goodsNewMoney) {
						this.goodsNewMoney = goodsNewMoney;
					}

					/**
					* 获取： 商品详情
					*/
					public String getGoodsContent() {
						return goodsContent;
					}
					/**
					* 设置： 商品详情
					*/
					public void setGoodsContent(String goodsContent) {
						this.goodsContent = goodsContent;
					}

















				//级联表的get和set kehu

					/**
					* 获取： 客户姓名
					*/
					public String getKehuName() {
						return kehuName;
					}
					/**
					* 设置： 客户姓名
					*/
					public void setKehuName(String kehuName) {
						this.kehuName = kehuName;
					}

					/**
					* 获取： 客户联系方式
					*/
					public String getKehuPhone() {
						return kehuPhone;
					}
					/**
					* 设置： 客户联系方式
					*/
					public void setKehuPhone(String kehuPhone) {
						this.kehuPhone = kehuPhone;
					}

					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}

					/**
					* 获取： 客户详情
					*/
					public String getKehuOrderContent() {
						return kehuOrderContent;
					}
					/**
					* 设置： 客户详情
					*/
					public void setKehuOrderContent(String kehuOrderContent) {
						this.kehuOrderContent = kehuOrderContent;
					}









				//级联表的get和set yonghu

					/**
					* 获取： 员工姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}
