use db_equipo_de_sonido;
insert into tbl_tipo_usuarios(id_tipo_usuarios,roll)
values (1,'administrador'),(2,'cliente'); 
-- datos de cliente
select * from tbl_usuarios;
insert into tbl_usuarios (id_usuarios, nombre_cliente, direccion,telefono, usuario, password, estado_activo, id_tipo_usuarios)
values(1,'David Balcárcel','Zona 6 Calle 14','54138499','dako','986',true,1);
insert into tbl_usuarios (nombre_cliente, direccion,telefono, usuario, password, estado_activo, id_tipo_usuarios)
values('Ricardo Aragón','Zona 1','23587412','richi','789',true,2);
drop table tbl_usuarios;
-- datos de proveedor
select * from tbl_proveedor; 
insert into tbl_proveedor (id_proveedor,proveedor,telefono,direccion,email )
values(1,'Apple','23268105','20 calle Zona 10','apple@gmail.com');
insert into tbl_proveedor (proveedor,telefono,direccion,email )
values('KSR','51184950','15 calle zona 10','kaiser@gmail.com');
insert into tbl_proveedor (proveedor,telefono,direccion,email )
values('ONN','76543908','2 calle Zona 1','ONN@gmail.com.com');
insert into tbl_proveedor (proveedor,telefono,direccion,email )
values('Sony','25890066','Zona 11','sonny@gmail.com');
-- datos de producto
select * from tbl_producto;
insert into tbl_producto (id_producto,producto,color,precio,estado_activo,id_proveedor)
values(1,'Radio','Marrón','299,99',true,1),
(2,'Audífonos','Negro','199,00',true,2);

-- datos de compra
select * from tbl_compra;
insert into tbl_compra (id_compra,fecha,id_usuarios,id_producto,estado_activo)
values(1,'2022-02-08',1,2,true);
-- datos de detalle_compra
select * from tbl_detalle_compra;
insert into tbl_detalle_compra (id_detalle_compra,id_compra,id_producto,cantidad)
values(1,1,1,2); 

dale click derecho a tu proyecto y dale find hash ---- me faltan hash creo 
