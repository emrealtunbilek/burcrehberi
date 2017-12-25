package com.emrealtunbilek.burcrehberiapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.emrealtunbilek.burcrehberiapp.R.array.burcTarih
import kotlinx.android.synthetic.main.tek_satir.view.*
import org.w3c.dom.Text

/**
 * Created by Emre on 25.12.2017.
 */
class BurclarArrayAdapter(var gelenContext: Context, resource: Int, textViewResourceId: Int, var burcAdlari: Array<String>, var burcTarihleri:Array<String>, var burcResimleri:Array<Int>)
    : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, burcAdlari) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var tek_satir_view=convertView
        var viewHolder:ViewHolder?=null

        if(tek_satir_view == null){
            val inflater=LayoutInflater.from(gelenContext)
            tek_satir_view=inflater.inflate(R.layout.tek_satir, parent, false)

            viewHolder= ViewHolder(tek_satir_view)
            tek_satir_view.tag=viewHolder





            Log.e("EMRE", "INFLATION YAPILDI : " + burcAdlari[position])
        }else{

           viewHolder=tek_satir_view.getTag() as ViewHolder
        }




        viewHolder.burcResim.setImageResource(burcResimleri[position])
        viewHolder.burcAdi.setText(burcAdlari[position])
        viewHolder.burcTarih.setText(burcTarihleri[position])

//        Log.e("TEST", ""+parent.toString())
//        Log.e("TEST", ""+tek_satir_view.toString())
//        Log.e("TEST", ""+tek_satir_view.parent)
//        Log.e("TEST", ""+tek_satir_view.layoutParams)





        return tek_satir_view
    }

    class ViewHolder(tek_satir_view:View?){

        var burcResim:ImageView
        var burcAdi:TextView
        var burcTarih:TextView

        init {
            this.burcResim=tek_satir_view!!.imgBurcSembol
            this.burcAdi=tek_satir_view.tvBurcAdi
            this.burcTarih=tek_satir_view.tvBurcTarihi
        }



    }


}