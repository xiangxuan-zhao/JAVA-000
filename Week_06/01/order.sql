CREATE TABLE `tb_order` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id' ,
`order_no`  bigint(20) NULL DEFAULT NULL COMMENT '订单号' ,
`user_id`  int(11) NULL DEFAULT NULL COMMENT '用户id' ,
`shipping_id`  int(11) NULL DEFAULT NULL ,
`payment`  decimal(20,2) NULL DEFAULT NULL COMMENT '实际付款金额,单位是元,保留两位小数' ,
`payment_type`  int(4) NULL DEFAULT NULL COMMENT '支付类型,1-在线支付' ,
`postage`  int(10) NULL DEFAULT NULL COMMENT '运费,单位是元' ,
`status`  int(10) NULL DEFAULT NULL COMMENT '订单状态:0-已取消-10-未付款，20-已付款，40-已发货，50-交易成功，60-交易关闭' ,
`payment_time`  datetime NULL DEFAULT NULL COMMENT '支付时间' ,
`send_time`  datetime NULL DEFAULT NULL COMMENT '发货时间' ,
`end_time`  datetime NULL DEFAULT NULL COMMENT '交易完成时间' ,
`close_time`  datetime NULL DEFAULT NULL COMMENT '交易关闭时间' ,
`create_time`  datetime NULL DEFAULT NULL COMMENT '创建时间' ,
`update_time`  datetime NULL DEFAULT NULL COMMENT '更新时间' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `order_no_index` (`order_no`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='订单表'
AUTO_INCREMENT=2
ROW_FORMAT=DYNAMIC
;

