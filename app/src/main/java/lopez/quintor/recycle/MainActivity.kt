package lopez.quintor.recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lugares = ArrayList<Lugar>()
        lugares.add(Lugar("Egipto","https://himbatours.com/media/k2/items/cache/afb2f0b609b92600310905cf1a1820fe_L.jpg", "EGIPTO"))
        lugares.add(Lugar("Mexico","https://lopezobrador.org.mx/wp-content/uploads/2019/09/15-09-2019-FESTIVAL-CULTURAS-DE-MEXICO-209-ANIVERSARIO-DE-LA-INDEPENDENCIA-.jpg", "MEXICO"))
        lugares.add(Lugar("Brazil","https://s3-eu-west-1.amazonaws.com/uploads.services.internations.org/files/2018/11/15182147/movingtoBrazil_0-2400x1350.jpg", "BRAZIL"))
        lugares.add(Lugar("Peru","https://www.roughguides.com/wp-content/uploads/2012/07/machu-picchu-peru-shutterstock_1044047035.jpg", "PERU"))
        lugares.add(Lugar("Colombia","https://www.gafilat.org/images/colombia.jpg", "COLOMBIA"))
        lugares.add(Lugar("Italia","https://viaje7dias.com/wp-content/uploads/2019/05/italia-en-7-dias.jpg", "ITALIA"))
        lugares.add(Lugar("Puerto Rico","http://vumagbucket.s3.amazonaws.com/wp-content/uploads/2018/01/23124528/curi01.jpg", "PUERTO RICO"))
        lugares.add(Lugar("China","https://static.iris.net.co/semana/upload/images/2018/10/25/588229_1.jpg", "CHINA"))
        lugares.add(Lugar("Argentina","https://www.eleconomista.com.mx/__export/1565930717691/sites/eleconomista/img/2019/08/15/shutterstock_1102234973.jpg_596760611.jpg", "ARGENTINA"))

        myRecicler.adapter = LugarAdapter(lugares,context = this)
        myRecicler.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)

    }
}
