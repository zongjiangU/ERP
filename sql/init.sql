create table user_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    password TEXT NOT NULL,
    role INTEGER NOT NULL
);

create table basic_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    tax INTEGER NOT NULL,
    type TEXT NOT NULL,
    customer TEXT NOT NULL,
    provider TEXT NOT NULL
);

create table product_plain (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    customer TEXT NOT NULL,
    point_type TEXT NOT NULL,
    num INTEGER NOT NULL,
    half TEXT NOT NULL,
    fenghe TEXT NOT NULL,
    hz_time BIGINT NOT NULL,
    yh_time BIGINT NOT NULL,
    extend TEXT NOT NULL
);

create table order_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    order_id TEXT NOT NULL UNIQUE,
    money_id TEXT NOT NULL,
    customer TEXT NOT NULL,
    hetong TEXT NOT NULL,
    chuhuo_time BIGINT NOT NULL,
    order_num INTEGER NOT NULL,
    price REAL NOT NULL,
    hetong_start_time BIGINT NOT NULL,
    fukuan_time BIGINT,
    extend TEXT NOT NULL
);

create table shoukuan_detail (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    time BIGINT NOT NULL,
    money_id TEXT NOT NULL,
    hetong_name TEXT NOT NULL,
    customer TEXT NOT NULL,
    yishou TEXT NOT NULL,
    zhanghu TEXT NOT NULL,
    extend TEXT NOT NULL
);

create table chuhuo_detail (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    time BIGINT NOT NULL,
    money_id TEXT NOT NULL,
    hetong_name TEXT NOT NULL,
    customer TEXT NOT NULL,
    total_num REAL NOT NULL,
    tax_rate REAL NOT NULL,
    tax_type TEXT NOT NULL
);

create table fuliao_fapiao (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    time BIGINT NOT NULL,
    money_id TEXT NOT NULL,
    hetong_name TEXT NOT NULL,
    customer TEXT NOT NULL,
    total_num REAL NOT NULL,
    tax_rate REAL NOT NULL,
    tax_type TEXT NOT NULL,
    tax_no TEXT NOT NULL,
    extend TEXT NOT NULL
);

create table yuangong_info (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    bumen TEXT NOT NULL,
    name TEXT NOT NULL,
    zhiwei TEXT NOT NULL,
    ruzhi_time BIGINT NOT NULL,
    id_card TEXT NOT NULL,
    jiguan TEXT NOT NULL,
    xingbie TEXT NOT NULL,
    hetongqishi_time BIGINT NOT NULL,
    hetongjieshu_time BIGINT NOT NULL,
    hetong_qixian TEXT NOT NULL,
    yongong_type TEXT NOT NULL,
    phone TEXT NOT NULL
);

