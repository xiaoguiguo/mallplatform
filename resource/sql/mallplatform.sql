-- 执行建表sql语句之前，需要手动新建7个数据库，库名分别为:mallpf_sys_config,mallpf_accounts,mallpf_trade,
-- mallpf_pay,mallpf_merchandise,mallpf_check,mallpf_coupon
-- 统一使用utf8编码，排序使用utf8_general_ci

-- 系统配置库
use mallpf_sys_config;
DROP TABLE if exists `sys_user`;
CREATE TABLE `sys_user` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `avatar`  varchar(255) DEFAULT NULL COMMENT '用户头像地址，默认头像',
  `username`  varchar(32) DEFAULT NULL COMMENT '用户名',
  `email` varchar(64) DEFAULT NULL COMMENT '用户邮箱地址',
  `phone` varchar(64) DEFAULT NULL COMMENT '手机/电话号码',
  `org_id`  bigint(20) DEFAULT NULL COMMENT '部门id（组织机构）',
  `job_id`  bigint(20) DEFAULT NULL COMMENT '职位id',
  `enabled` tinyint(1) DEFAULT NULL COMMENT '用户状态1启用2禁用',
  `password`  varchar(255) DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户信息表';

DROP TABLE if exists `sys_role`;
CREATE TABLE `sys_role` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(64) DEFAULT NULL COMMENT '角色名',
  `remark`  varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统角色表';

DROP TABLE if exists `sys_organization`;
CREATE TABLE `sys_organization` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '组织机构id',
  `name`  varchar(32) DEFAULT NULL COMMENT '部门名称',
  `pid` bigint(20) DEFAULT NULL COMMENT '上级部门',
  `remark`  varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统组织机构表';

DROP TABLE if exists `sys_job`;
CREATE TABLE `sys_job` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '职位id',
  `name`  varchar(32) DEFAULT NULL COMMENT '职位名称',
  `sort`  int(11) DEFAULT NULL COMMENT '职位排序',
  `org_id`  bigint(20)  DEFAULT NULL COMMENT '部门id',
  `remark`  varchar(128) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统职位表';

DROP TABLE if exists `sys_menu`;
CREATE TABLE `sys_menu` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `name`  varchar(32) DEFAULT NULL COMMENT '菜单名称',
  `component` varchar(255) DEFAULT NULL COMMENT '组件',
  `pid` bigint(20) DEFAULT NULL COMMENT '上级菜单',
  `sort`  int(11) DEFAULT NULL COMMENT '菜单排序',
  `path`  varchar(255) DEFAULT NULL COMMENT '链接地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统菜单表';

DROP TABLE if exists `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关联id',
  `user_id` bigint(20) DEFAULT NULL COMMENT '用户id',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户角色关系表';

DROP TABLE if exists `sys_role_organization`;
CREATE TABLE `sys_role_organization` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关联id',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `org_id`  bigint(20) DEFAULT NULL COMMENT '部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统角色组织机构关系表';

DROP TABLE if exists `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关联id',
  `role_id` bigint(20) DEFAULT NULL COMMENT '角色id',
  `menu_id` bigint(20) DEFAULT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统角色菜单表';

DROP TABLE if exists `sys_data_dict`;
CREATE TABLE `sys_data_dict` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `name`  varchar(32) DEFAULT NULL COMMENT '字典名称',
  `value` varchar(64) DEFAULT NULL COMMENT '字典值',
  `label` varchar(64) DEFAULT NULL COMMENT '字典标签',
  `sort`  int(11) DEFAULT NULL COMMENT '字典排序',
  PRIMARY KEY (`id`,`name`,`value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统数据字典表';

-- 账户系统库mall-account
use mallpf_accounts;
DROP TABLE if exists `account_info`;
CREATE TABLE `account_info` (
  `id`  bigint(20) NOT NULL COMMENT '账户id',
  `tripart_acct_id` bigint(20) DEFAULT NULL COMMENT '第三方账号id',
  `name`  varchar(32) DEFAULT NULL COMMENT '帐户名（用户名），唯一',
  `acct_type` tinyint(10) DEFAULT NULL COMMENT '帐户类型',
  `acct_status` tinyint(10) DEFAULT NULL COMMENT '帐户状态1激活2冻结3无效',
  `balance` decimal(10,2) DEFAULT NULL COMMENT '余额',
  `growth`  int(11) DEFAULT NULL COMMENT '成长值',
  `point` int(11) DEFAULT NULL COMMENT '积分值',
  `level` tinyint(5) DEFAULT NULL COMMENT '用户等级（账户等级）',
  `vip_status`  tinyint(1) DEFAULT NULL COMMENT '是否是会员0不是会员，1是会员',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户信息表';

DROP TABLE if exists `account_flow`;
CREATE TABLE `account_flow` (
  `id`  bigint(20) NOT NULL COMMENT '账户流水号',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '帐户id',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '交易id',
  `pay_type`  tinyint(10) DEFAULT NULL COMMENT '交易类型',
  `amt` decimal(10,2) DEFAULT NULL COMMENT '交易金额',
  `trade_time`  datetime DEFAULT NULL COMMENT '交易时间',
  `trade_status`  tinyint(10) DEFAULT NULL COMMENT '交易状态0创建1成功2失败3异常',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户流水表';

DROP TABLE if exists `account_report`;
CREATE TABLE `account_report` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户举报记录id',
  report_type tinyint(1) DEFAULT NULL COMMENT '举报类型0商品评价，1话题内容，2用户评论',
  acct_id bigint(20) DEFAULT NULL COMMENT '举报人id',
  description text DEFAULT NULL COMMENT '举报信息描述',
  report_status tinyint(1) DEFAULT NULL COMMENT '举报状态0未处理，1已处理',
  handle_status tinyint(1) DEFAULT NULL COMMENT '处理结果：0无效，1有效，2恶意',
  note  varchar(255) DEFAULT NULL COMMENT '处理人员备注',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户举报表';

DROP TABLE if exists `merchant`;
CREATE TABLE `merchant` (
  `id`  bigint(20) NOT NULL COMMENT '商户id',
  `name`  varchar(32) DEFAULT NULL COMMENT '商户名称',
  `email` varchar(64) DEFAULT NULL COMMENT '商户邮箱',
  `phone` varchar(32) DEFAULT NULL COMMENT '商户电话',
  `city`  varchar(32) DEFAULT NULL COMMENT '商户城市',
  `merchant_status` tinyint(1) DEFAULT NULL COMMENT '商户状态1启用，2冻结，3废弃',
  `logo`  varchar(500) DEFAULT NULL COMMENT '商户logo',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户信息表';


-- 交易系统库mall-trade
use mallpf_trade;
DROP TABLE if exists `trade`;
CREATE TABLE `trade` (
  `trade_id`  bigint(20) NOT NULL COMMENT '交易订单号',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '账户id',
  `coupon_id` bigint(20) DEFAULT NULL COMMENT '优惠券id',
  `amt` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `discount_amt`  decimal(10,2) DEFAULT NULL COMMENT '优惠金额',
  `freight_amt` decimal(10,2) DEFAULT NULL COMMENT '运费金额',
  `promotion_amt` decimal(10,2) DEFAULT NULL COMMENT '促销优化金额（促销价、满减、阶梯价）',
  `point_amt` decimal(10,2) DEFAULT NULL COMMENT '积分抵扣金额',
  `coupon_amt`  decimal(10,2) DEFAULT NULL COMMENT '优惠券抵扣金额',
  `pay_amt` decimal(10,2) DEFAULT NULL COMMENT '实际支付金额（=订单金额-优惠金额+运费-促销-积分-优惠券）',
  `pay_channel` tinyint(1) DEFAULT NULL COMMENT '支付渠道0支付宝，1微信，2账户余额，3其他',
  `source_type` tinyint(1) DEFAULT NULL COMMENT '订单来源0-PC订单，1APP订单',
  `trade_status`  tinyint(1) DEFAULT NULL COMMENT '订单状态0待付款，1待发货，2已发货，3已完成，4已关闭，5已退货，6已退货退款，7无效订单',
  `delivery_company`  tinyint(1) DEFAULT NULL COMMENT '物流公司0顺丰1中通2圆通等',
  `auto_confirm_day`  int(11) DEFAULT NULL COMMENT '自动确认时间',
  `confirm_status`  tinyint(1) DEFAULT NULL COMMENT '确认收货状态0未确认，1已确认',
  `use_point` int(11) DEFAULT NULL COMMENT '下单时使用的积分',
  `pay_time`  datetime DEFAULT NULL COMMENT '支付时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`trade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易订单表';

DROP TABLE if exists `trade_detail`;
CREATE TABLE `trade_detail` (
  `trade_id`  bigint(20) NOT NULL COMMENT '交易订单号',
  `point` int(11) DEFAULT NULL COMMENT '可以获得的积分',
  `growth`  int(11) DEFAULT NULL COMMENT '可以获得的成长值',
  `invoice_type`  tinyint(1) DEFAULT NULL COMMENT '发票类型0不开发票，1电子发票，2纸质发票',
  `invoice_header`  varchar(200) DEFAULT NULL COMMENT '发票抬头',
  `invoice_content` varchar(200) DEFAULT NULL COMMENT '发票内容',
  `invoice_receive_phone` varchar(32) DEFAULT NULL COMMENT '收票人电话',
  `invoice_receive_email` varchar(64) DEFAULT NULL COMMENT '收票人邮箱',
  `receive_name`  varchar(32) DEFAULT NULL COMMENT '收货人姓名',
  `receive_phone` varchar(32) DEFAULT NULL COMMENT '收货人电话',
  `receive_post_code` varchar(32) DEFAULT NULL COMMENT '收货人邮编',
  `receive_province`  varchar(32) DEFAULT NULL COMMENT '省份/直辖市',
  `receive_city`  varchar(32) DEFAULT NULL COMMENT '城市',
  `receive_region`  varchar(32) DEFAULT NULL COMMENT '区',
  `receive_detail_address`  varchar(200) DEFAULT NULL COMMENT '详细地址',
  `note`  varchar(500) DEFAULT NULL COMMENT '订单备注',
  `delivery_time` datetime DEFAULT NULL COMMENT '发货时间',
  `receive_time`  datetime DEFAULT NULL COMMENT '收货时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`trade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='交易订单详情表';

DROP TABLE if exists `trade_item`;
CREATE TABLE `trade_item` (
  `trade_id`  bigint(20) NOT NULL COMMENT '交易订单号',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `merchandise_pic` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `merchandise_name`  varchar(32) DEFAULT NULL COMMENT '商品名称',
  `brand` varchar(64) DEFAULT NULL COMMENT '品牌名称',
  `price` decimal(10,2) DEFAULT NULL COMMENT '商品价格',
  `quantity`  int(11) DEFAULT NULL COMMENT '购买数量',
  `merchandise_category_id` bigint(20) DEFAULT NULL COMMENT '商品分类id',
  `promotion_amt` decimal(10,2) DEFAULT NULL COMMENT '促销价格',
  `coupon_amt`  decimal(10,2) DEFAULT NULL COMMENT '优惠券价格',
  `point_amt` decimal(10,2) DEFAULT NULL COMMENT '积分优惠金额',
  `pay_amt` decimal(10,2) DEFAULT NULL COMMENT '支付金额',
  `gift_growth` int(11) DEFAULT NULL COMMENT '赠送的成长值',
  `gift_point`  int(11) DEFAULT NULL COMMENT '赠送的积分',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`trade_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单包含商品表';

DROP TABLE if exists `trade_return_apply`;
CREATE TABLE `trade_return_apply` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单申请退货id',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '交易记录id',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '账户id',
  `acct_name` varchar(32) DEFAULT NULL COMMENT '用户名（账户名称）',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `return_amt`  decimal(10,2) DEFAULT NULL COMMENT '退款金额',
  `return_name` varchar(32) DEFAULT NULL COMMENT '退款人姓名',
  `return_phone`  varchar(64) DEFAULT NULL COMMENT '退款人电话',
  `return_status` tinyint(1) DEFAULT NULL COMMENT '退货申请状态0待处理，1退货中，2已完成，3已拒绝',
  `handle_time` datetime DEFAULT NULL COMMENT '处理时间',
  `merchandise_pic` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `merchandise_name`  varchar(32) DEFAULT NULL COMMENT '商品名称',
  `brand` varchar(64) DEFAULT NULL COMMENT '商品品牌',
  `merchandise_attribute` varchar(128) DEFAULT NULL COMMENT '商品属性：颜色：红色，尺码：xl',
  `merchandise_count` int(11) DEFAULT NULL COMMENT '退货数量',
  `merchandise_price` decimal(10,2) DEFAULT NULL COMMENT '商品单价',
  `merchandise_pay_price` decimal(10,2) DEFAULT NULL COMMENT '商品实际支付价格',
  `reason`  varchar(256) DEFAULT NULL COMMENT '退货原因',
  `proof_pics`  varchar(1000) DEFAULT NULL COMMENT '凭证图片，以逗号隔开',
  `handle_note` varchar(500) DEFAULT NULL COMMENT '处理备注',
  `handle_man`  varchar(32) DEFAULT NULL COMMENT '处理人员',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单退货申请表';

-- 支付系统库mall-pay
use mallpf_pay;
DROP TABLE if exists `pay_flow`;
CREATE TABLE `pay_flow` (
  `pay_id`  bigint(20) NOT NULL COMMENT '支付订单号',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '交易单号',
  `trade_amt` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `pay_amt` decimal(10,2) DEFAULT NULL COMMENT '支付金额',
  `pay_type`  tinyint(1) DEFAULT NULL COMMENT '交易类型1充值，2支付，3退款',
  `pay_status`  tinyint(1) DEFAULT NULL COMMENT '支付状态0未支付1支付成功，2支付失败',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '支付用户账号',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `pay_channel_id`  tinyint(1) DEFAULT NULL COMMENT '支付渠道id',
  `pay_time`  datetime DEFAULT NULL COMMENT '支付时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`pay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付订单表';

DROP TABLE if exists `pay_channel`;
CREATE TABLE `pay_channel` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '支付渠道id',
  `pay_channel_name`  varchar(32) DEFAULT NULL COMMENT '支付渠道名称',
  `pay_channel_short_name`  varchar(32) DEFAULT NULL COMMENT '支付渠道简称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付渠道表';

DROP TABLE if exists `pay_channel_type`;
CREATE TABLE `pay_channel_type` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '支付方式id',
  `pct_name`  varchar(32) DEFAULT NULL COMMENT '支付方式名称',
  `pct_short_name`  varchar(32) DEFAULT NULL COMMENT '支付方式简称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付方式表';

DROP TABLE if exists `pay_channel_config`;
CREATE TABLE `pay_channel_config` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '支付渠道配置id',
  `pcc_name`  varchar(32) DEFAULT NULL COMMENT '渠道配置名称',
  `pcc_short_name`  varchar(32) DEFAULT NULL COMMENT '渠道配置简称',
  `pct_id`  bigint(20) DEFAULT NULL COMMENT '支付方式id',
  `config_params` varchar(255) DEFAULT NULL COMMENT '配置参数',
  `pcc_status`  tinyint(1) DEFAULT NULL COMMENT '配置状态0无效，1有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='支付渠道配置表';

-- 商品系统库 mall-merchandise
use mallpf_merchandise;
DROP TABLE if exists `merchandise`;
CREATE TABLE `merchandise` (
  `id`  bigint(20) NOT NULL COMMENT '商品id',
  `brand_id`  bigint(20) DEFAULT NULL COMMENT '品牌id',
  `merchandise_category_id` bigint(20) DEFAULT NULL COMMENT '商品分类id',
  `merchandise_attribute_category_id` bigint(20) DEFAULT NULL COMMENT '商品属性分类id',
  `name`  varchar(32) DEFAULT NULL COMMENT '商品名称',
  `pic` varchar(255) DEFAULT NULL COMMENT '商品图片',
  `publish_status`  tinyint(1) DEFAULT NULL COMMENT '上架状态0下架，1上架',
  `new_status`  tinyint(1) DEFAULT NULL COMMENT '新品状态0不是新品，1是新品',
  `recommand_status`  tinyint(1) DEFAULT NULL COMMENT '推荐状态0不推荐，1推荐',
  `verify_status` tinyint(1) DEFAULT NULL COMMENT '审核状态0未审核1审核通过',
  `sort`  int(11) DEFAULT NULL COMMENT '排序',
  `sale`  int(11) DEFAULT NULL COMMENT '销量',
  `price` decimal(10,2) DEFAULT NULL COMMENT '价格',
  `promotion_price` decimal(10,2) DEFAULT NULL COMMENT '促销价格',
  `gift_growth` int(11) DEFAULT NULL COMMENT '赠送的成长值',
  `gift_point`  int(11) DEFAULT NULL COMMENT '赠送的积分',
  `use_point_limit` int(11) DEFAULT NULL COMMENT '限制使用的积分数',
  `sub_title` varchar(255) DEFAULT NULL COMMENT '副标题',
  `description` text DEFAULT NULL COMMENT '商品描述',
  `market_price`  decimal(10,2) DEFAULT NULL COMMENT '市场价',
  `stock` int(11) DEFAULT NULL COMMENT '库存',
  `low_stock` int(11) DEFAULT NULL COMMENT '库存预警值',
  `unit`  varchar(16) DEFAULT NULL COMMENT '单位',
  `service_ids` varchar(64) DEFAULT NULL COMMENT '以逗号分隔的商品服务1无忧退货，2快速退款，3免费包邮',
  `keywords`  varchar(255) DEFAULT NULL COMMENT '商品关键字',
  `album_pics`  varchar(255) DEFAULT NULL COMMENT '画册图片，商品图片限制5张，以逗号分隔',
  `detail_title`  varchar(255) DEFAULT NULL COMMENT '详情页标题',
  `detail_desc` text DEFAULT NULL COMMENT '详情页商品描述',
  `detail_html` text DEFAULT NULL COMMENT '商品详情页网页内容',
  `detail_mobile_html`  text DEFAULT NULL COMMENT '移动端网页内容',
  `promotion_start_time`  datetime DEFAULT NULL COMMENT '促销开始时间',
  `promotion_end_time`  datetime DEFAULT NULL COMMENT '促销结束时间',
  `promotion_per_limit` int(11) DEFAULT NULL COMMENT '活动限购数量',
  `promotion_type`  tinyint(1) DEFAULT NULL COMMENT '促销类型0没有促销使用原价，1使用促销价，2使用会员价，3使用阶梯价格，4使用满减价格，5限时购',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品信息表';

DROP TABLE if exists `brand`;
CREATE TABLE `brand` (
  `id`  bigint(20) NOT NULL COMMENT '品牌id',
  `name`  varchar(32) DEFAULT NULL COMMENT '品牌名称',
  `sort`  int(11) DEFAULT NULL COMMENT '排序',
  `merchandise_count` int(11) DEFAULT NULL COMMENT '产品数量',
  `merchandise_comment_count` int(11) DEFAULT NULL COMMENT '产品评论数量',
  `logo`  varchar(255) DEFAULT NULL COMMENT '品牌logo',
  `big_pic` varchar(255) DEFAULT NULL COMMENT '专区大图',
  `brand_story` text DEFAULT NULL COMMENT '品牌故事',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品品牌表';

DROP TABLE if exists `merchandise_category`;
CREATE TABLE `merchandise_category` (
  `id`  bigint(20) NOT NULL COMMENT '商品分类id',
  `p_id`  bigint(20) DEFAULT NULL COMMENT '上级分类id',
  `name`  varchar(32) DEFAULT NULL COMMENT '分类名称',
  `level` tinyint(1) DEFAULT NULL COMMENT '分类级别0-1级，1-2级',
  `merchandise_count` int(11) DEFAULT NULL COMMENT '商品数量',
  `merchandise_unit` varchar(64) DEFAULT NULL COMMENT '商品单位',
  `nav_status`  tinyint(1) DEFAULT NULL COMMENT '是否显示在导航栏：0不显示，1显示',
  `show_status` tinyint(1) DEFAULT NULL COMMENT '显示状态0不显示，1显示',
  `sort`  int(11) DEFAULT NULL COMMENT '排序',
  `icon`  varchar(255) DEFAULT NULL COMMENT '图标',
  `description` text DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类表';

DROP TABLE if exists `merchandise_attribute`;
CREATE TABLE `merchandise_attribute` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品属性id',
  `merchandise_attribute_category_id` bigint(20) DEFAULT NULL COMMENT '商品属性分类id',
  `name`  varchar(32) DEFAULT NULL COMMENT '商品属性名称',
  `select_type` tinyint(1) DEFAULT NULL COMMENT '属性选择类型：0唯一，1单选，2多选',
  `input_type`  tinyint(1) DEFAULT NULL COMMENT '属性录入方式：0手工录入，1从列表中获取',
  `input_list`  varchar(255) DEFAULT NULL COMMENT '可选值列表，以逗号隔开',
  `sort`  int(11) DEFAULT NULL COMMENT '排序字段，最高的可以单独上传图片',
  `filter_type` tinyint(1) DEFAULT NULL COMMENT '分类筛选样式0普通，1颜色',
  `search_type` tinyint(1) DEFAULT NULL COMMENT '检索类型：0不需要检索，1关键字检索，2',
  `related_type`  tinyint(1) DEFAULT NULL COMMENT '相同属性产品是否关联0不关联，1关联',
  `type`  tinyint(1) DEFAULT NULL COMMENT '属性类型0规格，1参数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性表';

DROP TABLE if exists `merchandise_attribute_category`;
CREATE TABLE `merchandise_attribute_category` (
  `id`  bigint(20) NOT NULL COMMENT '商品属性分类id',
  `name`  varchar(32) DEFAULT NULL COMMENT '属性分类名称',
  `attribute_count` int(11) DEFAULT NULL COMMENT '属性数量',
  `param_count` int(11) DEFAULT NULL COMMENT '参数数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品属性分类表';

DROP TABLE if exists `merchandise_attribute_value`;
CREATE TABLE `merchandise_attribute_value` (
  `id`  bigint(20) NOT NULL COMMENT '角色id',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `merchandise_attribute_id`  bigint(20) DEFAULT NULL COMMENT '商品属性id',
  `value` varchar(64) DEFAULT NULL COMMENT '手动添加规格或参数的值，参数单值，规格有多个时，以逗号隔开',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品参数信息表';

DROP TABLE if exists `merchandise_comment`;
CREATE TABLE `merchandise_comment` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '商品评价id',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `acct_name` varchar(32) DEFAULT NULL COMMENT '用户名',
  `merchandise_name`  varchar(64) DEFAULT NULL COMMENT '商品名称',
  `star`  tinyint(1) DEFAULT NULL COMMENT '评价星数：0~5',
  `show_status` tinyint(1) DEFAULT NULL COMMENT '是否展示0不展示，1展示',
  `merchandise_attribute` varchar(255) DEFAULT NULL COMMENT '商品属性',
  `content` text DEFAULT NULL COMMENT '评价内容',
  `pics`  varchar(1000) DEFAULT NULL COMMENT '上传图片地址，以逗号隔开',
  `acct_icon` varchar(255) DEFAULT NULL COMMENT '评论用户头像',
  `like_count`  int(11) DEFAULT NULL COMMENT '评论点赞数',
  `unlike_count`  int(11) DEFAULT NULL COMMENT '评论不喜欢数',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间（评论不能修改）',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品评论表';

-- 对账系统库 mall-check
use mallpf_check;
DROP TABLE if exists `check_trade_flow`;
CREATE TABLE `check_trade_flow` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水id',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '订单id',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '账户id',
  `amt` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `pay_amt` decimal(10,2) DEFAULT NULL COMMENT '实际支付金额（=订单金额-优惠金额+运费-促销-积分-优惠券）',
  `pay_channel` tinyint(1) DEFAULT NULL COMMENT '支付渠道0支付宝，1微信，2账户余额，3其他',
  `source_type` tinyint(1) DEFAULT NULL COMMENT '订单来源0-PC订单，1APP订单',
  `trade_status`  tinyint(1) DEFAULT NULL COMMENT '订单状态0待付款，1待发货，2已发货，3已完成，4已关闭，5已退货，6已退货退款，7无效订单',
  `pay_time`  datetime DEFAULT NULL COMMENT '支付时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='对账交易流水表';

DROP TABLE if exists `check_pay_flow`;
CREATE TABLE `check_pay_flow` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水id',
  `pay_id`  bigint(20) DEFAULT NULL COMMENT '支付单号',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '交易单号',
  `trade_amt` decimal(10,2) DEFAULT NULL COMMENT '订单金额',
  `pay_amt` decimal(10,2) DEFAULT NULL COMMENT '支付金额',
  `pay_type`  tinyint(1) DEFAULT NULL COMMENT '交易类型1充值，2支付，3退款',
  `pay_status`  tinyint(1) DEFAULT NULL COMMENT '支付状态0未支付1支付成功，2支付失败',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '支付用户账号',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `pay_channel_id`  tinyint(1) DEFAULT NULL COMMENT '支付渠道id',
  `pay_time`  datetime DEFAULT NULL COMMENT '支付时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='对账支付流水表';

DROP TABLE if exists `check_account_flow`;
CREATE TABLE `check_account_flow` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '流水id',
  `acct_flow_id`  bigint(20) DEFAULT NULL COMMENT '帐户流水id',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '帐户id',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '交易id',
  `pay_type`  tinyint(10) DEFAULT NULL COMMENT '支付类型',
  `amt` decimal(10,2) DEFAULT NULL COMMENT '交易金额',
  `trade_time`  datetime DEFAULT NULL COMMENT '交易时间',
  `trade_status`  tinyint(10) DEFAULT NULL COMMENT '交易状态0创建1成功2失败3异常',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='对账账户流水表';

DROP TABLE if exists `check_result`;
CREATE TABLE `check_result` (
  `id`  bigint(20) NOT NULL COMMENT '角色id',
  `acct_id` bigint(20) DEFAULT NULL COMMENT '账户id',
  `merchant_id` bigint(20) DEFAULT NULL COMMENT '商户id',
  `pay_id`  bigint(20) DEFAULT NULL COMMENT '支付记录id',
  `trade_id`  bigint(20) DEFAULT NULL COMMENT '交易记录id',
  `acct_flow_id`  bigint(20) DEFAULT NULL COMMENT '账户流水id',
  `amt` decimal(10,2) DEFAULT NULL COMMENT '交易金额',
  `discount_amt`  decimal(10,2) DEFAULT NULL COMMENT '优惠金额',
  `source`  tinyint(1) DEFAULT NULL COMMENT '数据系统来源1账户系统，2交易系统，3支付系统',
  `pay_time`  datetime DEFAULT NULL COMMENT '支付时间',
  `check_status`  tinyint(1) DEFAULT NULL COMMENT '交易对账状态0未对账，1对账成功，2对账失败',
  `check_time`  datetime DEFAULT NULL COMMENT '对账时间',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='对账结果表';

-- 运营系统库 mall-coupon
use mallpf_coupon;
DROP TABLE if exists `coupon`;
CREATE TABLE `coupon` (
  `id`  bigint(20) NOT NULL COMMENT '优惠券id',
  `type`  tinyint(1) DEFAULT NULL COMMENT '优惠券类型0全场证券，1会员赠券，2购物赠券，3注册赠券',
  `name`  varchar(64) DEFAULT NULL COMMENT '优惠券名称',
  `platform`  tinyint(1) DEFAULT NULL COMMENT '使用平台0全部，1移动，2pc',
  `count` int(11) DEFAULT NULL COMMENT '数量',
  `amount`  decimal(10,2) DEFAULT NULL COMMENT '金额',
  `per_limit` int(11) DEFAULT NULL COMMENT '每人限领张数',
  `start_time`  datetime DEFAULT NULL COMMENT '优惠券的有效期起始时间',
  `end_time`  datetime DEFAULT NULL COMMENT '优惠券的有效期结束时间',
  `use_type`  tinyint(1) DEFAULT NULL COMMENT '使用类型0全场通用，1指定分类，2指定商品',
  `note`  varchar(255) DEFAULT NULL COMMENT '备注',
  `publish_count` int(11) DEFAULT NULL COMMENT '发行数量',
  `use_count` int(11) DEFAULT NULL COMMENT '已使用数量',
  `receive_count` int(11) DEFAULT NULL COMMENT '已领取数量',
  `receive_time`  datetime DEFAULT NULL COMMENT '可以领取的时间',
  `code`  varchar(64) DEFAULT NULL COMMENT '优惠码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券表';

DROP TABLE if exists `coupon_merchandise_category`;
CREATE TABLE `coupon_merchandise_category` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关系id',
  `coupon_id` bigint(20) DEFAULT NULL COMMENT '优惠券id',
  `merchandise_category_id` bigint(20) DEFAULT NULL COMMENT '商品分类id',
  `merchandise_category_name` varchar(32) DEFAULT NULL COMMENT '商品分类名称',
  `p_merchandise_category_name` varchar(64) DEFAULT NULL COMMENT '父分类名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券与商品分类关系表';

DROP TABLE if exists `coupon_merchandise`;
CREATE TABLE `coupon_merchandise` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '关系id',
  `coupon_id` bigint(20) DEFAULT NULL COMMENT '优惠券id',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `merchandise_name`  varchar(32) DEFAULT NULL COMMENT '商品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='优惠券与商品关系表';

DROP TABLE if exists `home_advertise`;
CREATE TABLE `home_advertise` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT '首页广告id',
  `name`  varchar(100) DEFAULT NULL COMMENT '广告名称',
  `type`  tinyint(1) DEFAULT NULL COMMENT '轮播位置0-PC首页轮播，1-APP首页轮播',
  `pic` varchar(500) DEFAULT NULL COMMENT '轮播图片',
  `start_time`  datetime DEFAULT NULL COMMENT '轮播时间的起始时间',
  `end_time`  datetime DEFAULT NULL COMMENT '轮播时间的结束时间',
  `ad_status`  tinyint(1) DEFAULT NULL COMMENT '上下线状态0下线，1上线',
  `click_count` int(11) DEFAULT NULL COMMENT '点击数',
  `order_count` int(11) DEFAULT NULL COMMENT '下单数',
  `url` varchar(500) DEFAULT NULL COMMENT '链接地址',
  `note`  varchar(255) DEFAULT NULL COMMENT '备注',
  `sort`  int(11) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='首页轮播广告表';

DROP TABLE if exists `home_brand`;
CREATE TABLE `home_brand` (
  `id`  bigint(20) NOT NULL COMMENT '首页推荐id',
  `brand_id`  bigint(20) DEFAULT NULL COMMENT '品牌id',
  `brand_name`  varchar(64) DEFAULT NULL COMMENT '品牌名称',
  `recommend_status`  tinyint(1) DEFAULT NULL COMMENT '推荐状态0不推荐，1推荐',
  `sort`  int(11) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='首页推荐品牌表';

DROP TABLE if exists `home_new_merchandise`;
CREATE TABLE `home_new_merchandise` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `merchandise_name`  varchar(64) DEFAULT NULL COMMENT '商品名称',
  `recommend_status`  tinyint(1) DEFAULT NULL COMMENT '推荐状态0不推荐，1推荐',
  `sort`  int(11) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='新鲜好物表';

DROP TABLE if exists `home_recommend_merchandise`;
CREATE TABLE `home_recommend_merchandise` (
  `id`  bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `merchandise_id`  bigint(20) DEFAULT NULL COMMENT '商品id',
  `merchandise_name`  varchar(64) DEFAULT NULL COMMENT '商品名称',
  `recommend_status`  tinyint(1) DEFAULT NULL COMMENT '推荐状态0不推荐，1推荐',
  `sort` int(11) DEFAULT NULL COMMENT '排序',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人气推荐商品表';