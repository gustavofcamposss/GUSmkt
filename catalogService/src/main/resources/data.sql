-- Inserindo produtos iniciais
INSERT INTO produto (ean, name, price, is_over18, image) VALUES
                                                             ('7894900010015','Coca-cola',3.99,false,'https://images.tcdn.com.br/img/img_prod/673450/coca_cola_lata_350_ml_1625_1_20190910092716.jpg'),
                                                             ('0070847033301','Monster Energy Juice Mango Loco 473ml',10.50,false,'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR1azYxlEuukjtqeqgK2DEdvZge_4zKWtH3ZA&s'),
                                                             ('7896045503919','Heineken Long Neck 330ml',8.30,true,'https://encrypted-tbn1.gstatic.com/shopping?q=tbn:ANd9GcR-vc9MaKtqZhq2aW7KEbHz5prgS3vFHzBvYjzLsbWIXPyMYyoIuNBtaecOT9cIb1yEvP18ip1mUC2uTxbdRrc-V-wXHJFS9Fe8p6Pei0wBRM2ahfz_Kb6B');

-- Inserindo funcionários iniciais
INSERT INTO funcionario (registration, name) VALUES
                                                 ('123456789','Gustavo Furtado Campos'),
                                                 ('987654321','João Pires');