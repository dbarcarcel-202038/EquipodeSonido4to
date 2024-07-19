select * from tbl_proveedor;

DELIMITER //
create procedure sp_agregarProveedor(
in _proveedor varchar(25), 
in _telefono int, 
in _direccion VARCHAR(25),
in _email varchar(40))
begin
insert into tbl_proveedor(
proveedor,
telefono,
direccion,
email)
values (_proveedor,_telefono,_direccion,_email);
end //
DELIMITER ;

DELIMITER //
create procedure sp_actualizarProveedor(
in _id int,
in _proveedor varchar(25), 
in _telefono INT, 
in _direccion varchar(25), 
in _email varchar(40))
begin
update tbl_proveedor
set proveedor = _proveedor, telefono = _telefono, direccion = _direccion, email = _email where id_proveedor = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_eliminarProveedor(
in _id int)
begin
delete from tbl_proveedor where id_proveedor = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_mostrarProveedor()
begin
select * from tbl_proveedor;
end // 
DELIMITER ;
call sp_agregarProveedor('LG','65780994','Zona 5','lg@gmail.com');

call sp_actualizarProveedor(2,'Samsung','12342342','Zona 1',' samsung@hotmail.com');

call sp_eliminarProveedor(2);
call sp_mostrarProveedor();

 -- -- -- -- -- -- -- Ingresar Datos (usuario) -- -- -- -- -- -- --
 select * from tbl_usuarios;

DELIMITER //
create procedure sp_agregarUsuario(
in _usuario varchar(25), 
in _contrasenia varchar(25), 
in _roll boolean,
in _estado boolean,
in _cliente int)
begin
insert into tbl_usuario(
usuario,
contraseña,
roll,
estado_activo,
id_cliente)
values (_usuario,_contrasenia,_roll,estado_activo,_cliente);
end //
DELIMITER ;

drop procedure sp_actualizarUsuario;
DELIMITER //
create procedure sp_actualizarUsuario(
in _id int,
in _usuario varchar(25), 
in _contrasenia varchar(25), 
in _roll boolean,
in _estado boolean,
in _cliente int)
begin
update tbl_usuario
set usuario = _usuario, contraseña = _contrasenia, roll = _roll, estado_activo = _estado, id_cliente = _cliente where id_usuario = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_eliminarUsuario(
in _id int)
begin
delete from tbl_usuario where id_usuario = _id;
END //
DELIMITER ;

call sp_agregarUsuario('Pepe','147',true,true,1);

call sp_actualizarUsuario(2,'Rivera','159',FALSE,true,2);

call sp_eliminarUsuario(2);

 -- -- -- -- -- -- -- Ingresar Datos (producto) -- -- -- -- -- -- --
select * from tbl_producto;

DELIMITER //
create procedure sp_agregarProducto(
in _modelo varchar(25), 
in _color varchar(25), 
in _velocidades int,
in _precio varchar(30),
in _estado boolean,
in _proveedor int)
begin
insert into tbl_producto(
modelo,
color,
velocidades,
precio,
estado_activo,
id_proveedor)
values (_modelo,_color,_velocidades,_precio,estado_activo,_proveedor);
end //
DELIMITER ;

DELIMITER //
create procedure sp_actualizarProducto(
in _id int,
in _modelo varchar(25), 
in _color varchar(25), 
in _velocidades int,
in _precio varchar(30),
in _estado boolean,
in _proveedor int)
begin
update tbl_producto
set modelo = _modelo, color = _color, velocidades = _velocidades,precio = _precio, estado_activo = _estado, id_proveedor = _proveedor where id_producto = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_eliminarProducto(
in _id int)
begin
delete from tbl_producto where id_producto = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_mostrarProducto()
begin
select * from tbl_producto;
end // 
DELIMITER ;

call sp_agregarProducto('Radio','verde','1,600',true,3);

call sp_actualizarProducto(2,'Biker','azul','1,500',true,1);

call sp_eliminarProducto(2);

 -- -- -- -- -- -- -- Ingresar Datos (compra) -- -- -- -- -- -- --

select * from tbl_compra;

DELIMITER //
create procedure sp_agregarCompra(
in _fecha date, 
in _cliente int,
in _producto int,
in _estado boolean)
begin
insert into tbl_compra(
fecha,
id_usuarios,
id_producto,
estado_activo)
values (_fecha, _cliente,_producto,_estado);
end //
DELIMITER ;

DELIMITER //
create procedure sp_actualizarCompra(
in _id int,
in _fecha date, 
in _cliente int,
in _producto int,
in _estado boolean)
begin
update tbl_compra
set fecha = _fecha, id_usuarios = _cliente, id_producto=_producto, estado_activo = _estado where id_compra = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_eliminarCompra(
in _id int)
begin
delete from tbl_compra where id_compra = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_mostrarCompra()
begin
select * from tbl_compra;
end // 
DELIMITER ;
create procedure sp_buscarCompra (in id int)
 select * from tbl_compra where id_compra = id;
 
 call sp_buscarCompra(1);

call sp_agregarCompra('2022-12-16',1,1,true);

call sp_actualizarCompra(2,'2023-11-12',2,2,false);

call sp_eliminarCompra(2);

 -- -- -- -- -- -- -- Ingresar Datos (detalle_compra) -- -- -- -- -- -- --


select * from tbl_detalle_compra;

DELIMITER //
create procedure sp_agregarDetalle_compra(
in _compra int, 
in _producto int,
in _cantidad int)
begin
insert into tbl_detalle_compra(
id_compra,
id_producto,
cantidad)
values (_compra, _producto,_cantidad);
end //
DELIMITER ;

DELIMITER //
create procedure sp_actualizarDetalle_compra(
in _id int,
in _compra int, 
in _producto int,
in _cantidad int)
begin
update tbl_detalle_compra
set id_compra = _compra, id_producto = _producto, cantidad = _cantidad where id_detalle_compra = _id;
END //
DELIMITER ;

DELIMITER //
create procedure sp_eliminarDetalle_compra(
in _id int)
begin
delete from tbl_detalle_compra where id_detalle_compra = _id;
END //
DELIMITER ;

call sp_agregarDetalle_compra('1','1','2');

call sp_actualizarDetalle_compra(2,'1','1','2');

call sp_eliminarDetalle_compra(2);
