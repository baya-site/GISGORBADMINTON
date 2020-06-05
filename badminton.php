<?php
$username = "id13159925_root";
$servername = "localhost";
$dbname = "id13159925_dbbadminton";
$password = "Busungbiu123#";

//Buat Koneksi
$conn = new mysqli($servername,$username,$password,$dbname);

//Buat Kondisi Check Koneksi
if($conn->connect_error){
	die("connection failed". $conn->connect_error);
}
$sql = "SELECT * FROM t_lokasi";

$result = $conn->query($sql);
$data = array();

if ($result->num_rows>0){
	while($row=$result->fetch_assoc()){
		$data[]=$row;
	}
}else{
	echo "0 result";

}
echo json_encode($data);
$conn->close();

?>