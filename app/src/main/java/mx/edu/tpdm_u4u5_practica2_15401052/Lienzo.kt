package mx.edu.tpdm_u4u5_practica2_15401052

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View
import android.widget.Toast

class Lienzo(p:MainActivity): View(p) {
    var puntero = p
    var imagenTec = Imagen(this, -80f, -420f, R.drawable.tecnologico490)
    var ed_ud = Imagen(this, 630f, 1280f, R.drawable.ed_ud)
    var ed_cb = Imagen(this, 250f, 1380f, R.drawable.ed_cb)
    var ed_uvp = Imagen(this, -50f, 1370f, R.drawable.ed_uvp)
    var ed_lc = Imagen(this, 255f, 1300f, R.drawable.ed_lc)
    var ed_liia = Imagen(this, 30f, 1100f, R.drawable.ed_liia)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        imagenTec.pintar(c)
        ed_ud.pintar(c)
        ed_cb.pintar(c)
        ed_uvp.pintar(c)
        ed_lc.pintar(c)
        ed_liia.pintar(c)

    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN -> {
                if(ed_ud.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. UD: Dep. de Sistemas e Industrial y cuenta con diversos salones ", Toast.LENGTH_LONG).show()
                }

                if(ed_cb.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. CB: Imparten clases de Ciencias Básicas", Toast.LENGTH_LONG).show()
                }

                if(ed_uvp.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. UVP: Oficinas de Residencias y servicio social, además imparten clases de ingles", Toast.LENGTH_LONG).show()
                }

                if(ed_lc.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. LC: Laboratorio de computo, taller de redes", Toast.LENGTH_LONG).show()
                }

                if(ed_liia.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. LIIA: Laboratorio de algo:c, dicen que tiene los baños de Hotel", Toast.LENGTH_LONG).show()
                }
            }

        }
        return true
    }

}



