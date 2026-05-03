-- V2: seed data for produto and funcionario

INSERT INTO produto (ean, name, price, is_over18, image) VALUES
('0000000000001','Produto Teste 1',10.99,false,'https://example.com/img1.jpg'),
('0000000000002','Produto Teste 2',5.50,false,'https://example.com/img2.jpg'),
('0000000000003','Produto Teste 3',20.00,true,'https://example.com/img3.jpg'),
('0000000000004','Produto Teste 4',7.75,false,'https://example.com/img4.jpg'),
('0000000000005','Produto Teste 5',15.30,true,'https://example.com/img5.jpg'),
('0000000000006','Produto Teste 6',2.99,false,'https://example.com/img6.jpg'),
('0000000000007','Produto Teste 7',9.99,false,'https://example.com/img7.jpg'),
('0000000000008','Produto Teste 8',12.49,true,'https://example.com/img8.jpg'),
('0000000000009','Produto Teste 9',3.00,false,'https://example.com/img9.jpg'),
('0000000000010','Produto Teste 10',99.99,true,'https://example.com/img10.jpg');

INSERT INTO funcionario (registration, name) VALUES
('EMP000000001','Funcionario Teste 1'),
('EMP000000002','Funcionario Teste 2');
