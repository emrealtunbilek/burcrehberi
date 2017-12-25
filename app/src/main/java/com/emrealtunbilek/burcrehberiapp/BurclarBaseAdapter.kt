package com.emrealtunbilek.burcrehberiapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*

/**
 * Created by Emre on 25.12.2017.
 */
class BurclarBaseAdapter(context: Context) : BaseAdapter() {

    var tumBurclar:ArrayList<Burclar>
    var context:Context

    init {
        tumBurclar=ArrayList<Burclar>(12)
        this.context=context

        var burcAdlari=context.resources.getStringArray(R.array.burclar)
        var burcTarihleri=context.resources.getStringArray(R.array.burcTarih)
        var burcResimleri = arrayOf(R.drawable.koc1, R.drawable.boga2, R.drawable.ikizler3, R.drawable.yengec4, R.drawable.aslan5, R.drawable.basak6,
                R.drawable.terazi7, R.drawable.akrep8, R.drawable.yay9, R.drawable.oglak10, R.drawable.kova11, R.drawable.balik12)

        for (i in 0..11){
            var arraylisteAtanacakBurc=Burclar(burcAdlari[i], burcTarihleri[i], burcResimleri[i])
            tumBurclar.add(arraylisteAtanacakBurc)
        }

    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {


        var tek_satir_view = convertView
        var viewHolder:ViewHolder2

        if(tek_satir_view == null){
            var inflater=LayoutInflater.from(context)
            tek_satir_view = inflater.inflate(R.layout.tek_satir, parent, false)

            viewHolder= ViewHolder2(tek_satir_view)
            tek_satir_view.tag=viewHolder

        }else {

            viewHolder=tek_satir_view.getTag() as ViewHolder2

        }



        viewHolder.burcResim.setImageResource(tumBurclar.get(position).burcSembol)
        viewHolder.burcAdi.setText(tumBurclar.get(position).burcAdi)
        viewHolder.burcTarih.setText(tumBurclar.get(position).burcTarih)

        return tek_satir_view


    }

    override fun getItem(position: Int): Any {
        return tumBurclar.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
       return tumBurclar.size
    }
}

data class Burclar(var burcAdi:String, var burcTarih:String, var burcSembol:Int){}

class ViewHolder2 (tek_satir_view:View){

    var burcResim:ImageView
    var burcAdi:TextView
    var burcTarih:TextView

    init {
        this.burcResim=tek_satir_view.imgBurcSembol
        this.burcAdi=tek_satir_view.tvBurcAdi
        this.burcTarih=tek_satir_view.tvBurcTarihi
    }


}