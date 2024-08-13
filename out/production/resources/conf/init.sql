
DROP TABLE IF EXISTS BRAND;

CREATE TABLE brand (
    brand_id VARCHAR(255) PRIMARY KEY COMMENT '브랜드 아이디'
) ;

DROP TABLE IF EXISTS GOODS;

CREATE TABLE goods (
    goods_id BIGINT AUTO_INCREMENT PRIMARY KEY COMMENT '상품 아이디',
    price BIGINT COMMENT '상품 가격',
    category VARCHAR(255) COMMENT '카테고리',
    brand_id VARCHAR(255) COMMENT '브랜드 아이디',
    CONSTRAINT fk_brand FOREIGN KEY (brand_id) REFERENCES brand(brand_id)
);

INSERT INTO brand (brand_id) VALUES ('A');
INSERT INTO brand (brand_id) VALUES ('B');
INSERT INTO brand (brand_id) VALUES ('C');
INSERT INTO brand (brand_id) VALUES ('D');
INSERT INTO brand (brand_id) VALUES ('E');
INSERT INTO brand (brand_id) VALUES ('F');
INSERT INTO brand (brand_id) VALUES ('G');
INSERT INTO brand (brand_id) VALUES ('H');
INSERT INTO brand (brand_id) VALUES ('I');

INSERT INTO goods (price, category, brand_id) VALUES (11200, '상의', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (5500, '아우터', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (4200, '바지', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (9000, '스니커즈', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '가방', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (1700, '모자', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (1800, '양말', 'A');
INSERT INTO goods (price, category, brand_id) VALUES (2300, '액세서리', 'A');

INSERT INTO goods (price, category, brand_id) VALUES (10500, '상의', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (5900, '아우터', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (3800, '바지', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (9100, '스니커즈', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '가방', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '모자', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '양말', 'B');
INSERT INTO goods (price, category, brand_id) VALUES (2200, '액세서리', 'B');

INSERT INTO goods (price, category, brand_id) VALUES (10000, '상의', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (6200, '아우터', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (3300, '바지', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (9200, '스니커즈', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (2200, '가방', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (1900, '모자', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (2200, '양말', 'C');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '액세서리', 'C');

INSERT INTO goods (price, category, brand_id) VALUES (10100, '상의', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (5100, '아우터', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (3000, '바지', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (9500, '스니커즈', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (2500, '가방', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (1500, '모자', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (2400, '양말', 'D');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '액세서리', 'D');

INSERT INTO goods (price, category, brand_id) VALUES (10700, '상의', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (5000, '아우터', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (3800, '바지', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (9900, '스니커즈', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (2300, '가방', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (1800, '모자', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '양말', 'E');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '액세서리', 'E');

INSERT INTO goods (price, category, brand_id) VALUES (11200, '상의', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (7200, '아우터', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (4000, '바지', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (9300, '스니커즈', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '가방', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (1600, '모자', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (2300, '양말', 'F');
INSERT INTO goods (price, category, brand_id) VALUES (1900, '액세서리', 'F');

INSERT INTO goods (price, category, brand_id) VALUES (10500, '상의', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (5800, '아우터', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (3900, '바지', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (9000, '스니커즈', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (2200, '가방', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (1700, '모자', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '양말', 'G');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '액세서리', 'G');

INSERT INTO goods (price, category, brand_id) VALUES (10800, '상의', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (6300, '아우터', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (3100, '바지', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (9700, '스니커즈', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (2100, '가방', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (1600, '모자', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '양말', 'H');
INSERT INTO goods (price, category, brand_id) VALUES (2000, '액세서리', 'H');

INSERT INTO goods (price, category, brand_id) VALUES (11400, '상의', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (6700, '아우터', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (3200, '바지', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (9500, '스니커즈', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (2400, '가방', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (1700, '모자', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (1700, '양말', 'I');
INSERT INTO goods (price, category, brand_id) VALUES (2400, '액세서리', 'I');
