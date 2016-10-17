/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;


public class StarterApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Habilite armazenamento local.
    Parse.enableLocalDatastore(this);

    // Codigo de configuração do App
    Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
            .applicationId("FKMy3kqbl3yZwxTCWXYHbPVzFgXG7PhEFfUgoK14")
            .clientKey("2iaHtuOJdlOWyZLcn50uyCieQAvXlY2dYFJzR8Ay")
            .server("https://parseapi.back4app.com/")
    .build()
    );

//
//      // Teste de configuração do App
//      ParseObject pontuacao = new ParseObject("Pontuacao");
//      pontuacao.put("pontos", 100);
//      pontuacao.saveInBackground(new SaveCallback() {
//          public void done(ParseException e) {
//              if (e == null) {
//                  Log.i("TesteExecucao", "Salvo com sucesso!!!");
//              } else {
//                  Log.i("TesteExecucao", "Falha ao salvar os dados!!!");
//              }
//          }
//      });


      ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
     defaultACL.setPublicReadAccess(true);  // aqui o acesso é público e pode-se consultar e filtrar os dados
//    ParseACL.setDefaultACL(defaultACL, true);    //aqui o parse precisa da Master Key para dar acesso. Pode add, mas não pode consultar ou filtrar
  }
}
