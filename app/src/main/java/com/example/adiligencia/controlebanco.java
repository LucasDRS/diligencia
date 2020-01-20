
package com.example.adiligencia;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class controlebanco {

    private SQLiteDatabase db;
    private criabanco banco;
    private static final String NOME = "nome";
    private static final String TABELA = "usuarios";
    private static final String ID = "_id";
    private static final String EMAIL = "email";
    private static final String SENHA = "senha";
    private static final int VERSAO = 2;

    public controlebanco(Context context) {
        banco = new criabanco(context);
    }

    public String insereDado(String nome, String mail, String senha) {
        ContentValues valores;
        long resultado;

        db = banco.getWritableDatabase();

        valores = new ContentValues();
        valores.put(SENHA, senha);
        valores.put(NOME, nome);
        valores.put(EMAIL, mail);



        resultado = db.insert(TABELA, null, valores);
        db.close();

        if (resultado == -1)
            return "Erro ao inserir registro";
        else
            return "Registro inserido com sucesso";

    }
}