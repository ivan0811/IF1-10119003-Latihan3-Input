package com.input;
import java.util.Scanner;

/*
	NAMA = Ivan Faathirza
	KELAS = IF1
	NIM = 10119003
	Deskripsi program = program ini untuk memasukkan nilai dari keyboard dan menampilkan ke layar
 */
public class input {

    public static void main(String[] args) {
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
}
