package com.emrealtunbilek.burcrehberiapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.tek_satir.view.*

/**
 * Created by Emre on 25.12.2017.
 */
class BurclarArrayAdapter(var gelenContext: Context, resource: Int, textViewResourceId: Int, var burcAdlari: Array<String>, var burcTarihleri:Array<String>, var burcResimleri:Array<Int>)
    : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, burcAdlari) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var inflater=LayoutInflater.from(gelenContext)
        val tek_satir_view=inflater.inflate(R.layout.tek_satir, parent, false)

        var burcImageView=tek_satir_view.imgBurcSembol
        var burcAdi=tek_satir_view.tvBurcAdi
        var burcTarih=tek_satir_view.tvBurcTarihi

        burcImageView.setImageResource(burcResimleri[position])
        burcAdi.setText(burcAdlari[position])
        burcTarih.setText(burcTarihleri[position])

        Log.e("TEST", ""+parent.toString())
        Log.e("TEST", ""+tek_satir_view.toString())
        Log.e("TEST", ""+tek_satir_view.parent)
        Log.e("TEST", ""+tek_satir_view.layoutParams)



        return tek_satir_view
    }

}