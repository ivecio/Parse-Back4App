/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

      /********************
       * Cadastro de usuário
       *********************/
      ParseUser usuario = new ParseUser();
      usuario.setUsername("ivecio");
      usuario.setPassword("123456");
      usuario.setEmail("ivecio@ivecio.com"); // o email não é obrigatório para usuário Parse

      //Cadastrar
      usuario.signUpInBackground(new SignUpCallback() {
          @Override
          public void done(ParseException e) {

              if ( e == null ) { //deu certo
                Log.i("CadastroUsuario", "Sucesso ao cadastrar usuário");
              } else { //erro
                  Log.i("CadastroUsuario", "Erro ao cadastrar usuario: " + e.getMessage() );
              }
          }
      });


//      // o ParseObject cria uma classe e salva objectos dentro dessa classe
//      ParseObject pontuacao = new ParseObject("Pontuacao");
//      pontuacao.put("nome", "José");
//      pontuacao.put("pontos", 3800);
//      pontuacao.saveInBackground(new SaveCallback() {
//          @Override
//          public void done(ParseException e) {
//              if (e == null) { //não temos erros
//                    Log.i("salvarDados", "Dados salvos com sucesso");
//              } else { //temos erros
//                    Log.i("salvarDados", "Erro ao salvar dados");
//              }
//          }
//      });

//      //Para recuperar dados de um objeto Parse, usa-se o ParseQuery
//      ParseQuery<ParseObject> consulta = ParseQuery.getQuery("Pontuacao");
//      consulta.getInBackground("khJPhF3cnd", new GetCallback<ParseObject>() { //usando ID de Rafaela
//          @Override
//          public void done(ParseObject object, ParseException e) {  //Call Back é um retorno se deu certo ou não
//
//              if ( e == null ) { //nao temos erros
//
//                  object.put("pontos", 2700);
//                  object.saveInBackground();
//
//              }else {
//                  Log.i("consultaObjeto", "Erro ao consultar objeto");
//              }
//          }
//      });

        //Comandos para filtrar dados
//      ParseQuery<ParseObject> filtro = ParseQuery.getQuery("Pontuacao");

      //Aplicando filtros na listagem de objetos
//      filtro.whereGreaterThan("pontos", 800);
//      filtro.whereGreaterThanOrEqualTo("pontos", 800);
//        filtro.whereLessThan("pontos", 1000);
//        filtro.whereEndsWith("nome", "ele");
//        filtro.whereStartsWith("nome", "I");
//        filtro.addAscendingOrder("pontos");
//        filtro.addDescendingOrder("pontos");
//        filtro.setLimit(3);

//      //listar os dados
//      filtro.findInBackground(new FindCallback<ParseObject>() {
//          @Override
//          public void done(List<ParseObject> objects, ParseException e) {
//
//              if ( e == null ) {
////                  Log.i("listarDados", "Sucesso ao listar dados - " + objects.size() );
//
//                  for ( ParseObject object : objects ) {
//                      Log.i("listarDados", "objetos - " + object.get("nome") + " pontos: " + object.get("pontos") );
//                  }
//
//              }else {
//                  Log.i("listarDados", "Erro ao listar dados - " + e.getMessage()  );
//              }
//
//          }
//      });
  }
}
