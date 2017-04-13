package br.com.fiap.notas.util;

import android.telecom.Call;

/**
 * Created by logonrm on 12/04/2017.
 */

public interface CloudantRequestInterface {
    @GET("_all_docs?include_docs=true")
    Call<CloudantResponseNota> getAllJson();

}
