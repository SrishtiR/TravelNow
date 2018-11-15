package com.srishti.travelnow;

public class Main {
	public static void main(String[] args) throws Exception {
        MysqlCon dao = new MysqlCon();
        dao.readDataBase();
    }
}
