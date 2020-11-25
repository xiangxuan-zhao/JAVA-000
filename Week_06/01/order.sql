CREATE TABLE `tb_order` (
`id`  int(11) NOT NULL AUTO_INCREMENT COMMENT '����id' ,
`order_no`  bigint(20) NULL DEFAULT NULL COMMENT '������' ,
`user_id`  int(11) NULL DEFAULT NULL COMMENT '�û�id' ,
`shipping_id`  int(11) NULL DEFAULT NULL ,
`payment`  decimal(20,2) NULL DEFAULT NULL COMMENT 'ʵ�ʸ�����,��λ��Ԫ,������λС��' ,
`payment_type`  int(4) NULL DEFAULT NULL COMMENT '֧������,1-����֧��' ,
`postage`  int(10) NULL DEFAULT NULL COMMENT '�˷�,��λ��Ԫ' ,
`status`  int(10) NULL DEFAULT NULL COMMENT '����״̬:0-��ȡ��-10-δ���20-�Ѹ��40-�ѷ�����50-���׳ɹ���60-���׹ر�' ,
`payment_time`  datetime NULL DEFAULT NULL COMMENT '֧��ʱ��' ,
`send_time`  datetime NULL DEFAULT NULL COMMENT '����ʱ��' ,
`end_time`  datetime NULL DEFAULT NULL COMMENT '�������ʱ��' ,
`close_time`  datetime NULL DEFAULT NULL COMMENT '���׹ر�ʱ��' ,
`create_time`  datetime NULL DEFAULT NULL COMMENT '����ʱ��' ,
`update_time`  datetime NULL DEFAULT NULL COMMENT '����ʱ��' ,
PRIMARY KEY (`id`),
UNIQUE INDEX `order_no_index` (`order_no`) USING BTREE 
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
COMMENT='������'
AUTO_INCREMENT=2
ROW_FORMAT=DYNAMIC
;

