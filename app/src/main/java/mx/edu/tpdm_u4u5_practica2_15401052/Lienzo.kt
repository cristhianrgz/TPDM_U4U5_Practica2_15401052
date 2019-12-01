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
    var ed_lic = Imagen(this, 90f, 680f, R.drawable.ed_licbi)
    var ed_f = Imagen(this, 270f, 1000f, R.drawable.ed_f)
    var ed_s = Imagen(this, 435f, 1050f, R.drawable.ed_s)
    var ed_ad = Imagen(this, 655f, 1020f, R.drawable.ed_ad)
    var ed_ci = Imagen(this, 780f, 930f, R.drawable.ed_cl)
    var ed_ta = Imagen(this, 950f, 930f, R.drawable.ed_ta)
    var ed_k = Imagen(this, 435f, 980f, R.drawable.ed_k)
    var ed_j = Imagen(this, 400f, 900f, R.drawable.ed_j)
    var ed_l = Imagen(this, 550f, 880f, R.drawable.ed_l)
    var ed_x = Imagen(this, 760f, 850f, R.drawable.ed_x)
    var ed_n = Imagen(this, 890f, 850f, R.drawable.ed_n)
    var ed_h = Imagen(this, 400f, 815f, R.drawable.ed_h)
    var ed_m = Imagen(this, 610f, 795f, R.drawable.ed_m)
    var ed_aa = Imagen(this, 780f, 770f, R.drawable.ed_aa)
    var ed_gg = Imagen(this, 850f, 670f, R.drawable.ed_gg)
    var ed_g = Imagen(this, 705f, 680f, R.drawable.ed_g)
    var ed_q = Imagen(this, 710f, 600f, R.drawable.ed_q)
    var ed_ee = Imagen(this, 590f, 665f, R.drawable.ed_ee)
    var ed_p = Imagen(this, 465f, 715f, R.drawable.ed_p)
    var ed_pp = Imagen(this, 390f, 725f, R.drawable.ed_pp)
    var ed_b = Imagen(this, 460f, 640f, R.drawable.ed_b)
    var ed_bb = Imagen(this, 250f, 605f, R.drawable.ed_bb)
    var ed_bg = Imagen(this, 600f, 460f, R.drawable.ed_bg)
    var buscar = Imagen(this, 0f, 1530f, R.drawable.buscar)
    var balon = Imagen(this, 700f, 200f, R.drawable.balon)
    var balon2 = Imagen(this, 910f, 200f, R.drawable.balon)
    var domo = Imagen(this, 450f, 100f, R.drawable.domo)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        imagenTec.pintar(c)
        ed_ud.pintar(c)
        ed_cb.pintar(c)
        ed_uvp.pintar(c)
        ed_lc.pintar(c)
        ed_liia.pintar(c)
        ed_lic.pintar(c)
        ed_f.pintar(c)
        ed_s.pintar(c)
        ed_ad.pintar(c)
        ed_ci.pintar(c)
        ed_ta.pintar(c)
        ed_k.pintar(c)
        ed_j.pintar(c)
        ed_l.pintar(c)
        ed_x.pintar(c)
        ed_n.pintar(c)
        ed_h.pintar(c)
        ed_m.pintar(c)
        ed_aa.pintar(c)
        ed_gg.pintar(c)
        ed_g.pintar(c)
        ed_q.pintar(c)
        ed_ee.pintar(c)
        ed_p.pintar(c)
        ed_pp.pintar(c)
        ed_b.pintar(c)
        ed_bb.pintar(c)
        ed_bg.pintar(c)
        buscar.pintar(c)
        balon.pintar(c)
        balon2.pintar(c)
        domo.pintar(c)
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

                if(ed_lic.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. LICBI: Laboratorio de , dicen que tiene los baños de Hotel", Toast.LENGTH_LONG).show()
                }

                if(ed_f.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. F: Laboratorio de electrica, prácticas de Principios Electricos", Toast.LENGTH_LONG).show()
                }

                if(ed_s.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. S: Departamento de becas alimenticias, ahí trabajaba el comite estudiantil", Toast.LENGTH_LONG).show()
                }

                if(ed_ad.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. AD: Edificio administrativo, aquí se encuentra servicios escolares, financieros y coordinadores de carreras", Toast.LENGTH_LONG).show()
                }

                if(ed_ci.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste a la Biblioteca, contiene áreas de descanso (CREO) a las cuales nunca he ido :c", Toast.LENGTH_LONG).show()
                }

                if(ed_ta.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. TA: Departamento de arquitectura y se encuentran algunos salones para clases", Toast.LENGTH_LONG).show()
                }

                if(ed_k.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. K: No se para que sea :c, pero ahí nos revisa prácticas la maestra Claudia para la materia de SP", Toast.LENGTH_LONG).show()
                }

                if(ed_j.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. J: Lugar para imprimir y copias, y dan clases de electrica y mecratronica", Toast.LENGTH_LONG).show()
                }

                if(ed_l.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. L: Laboratorio de Industrial y salones para clases", Toast.LENGTH_LONG).show()
                }

                if(ed_x.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. X: Edificio para clases de diferentes carreras, ahí llevamos clases de administración, contabilidad y ética", Toast.LENGTH_LONG).show()
                }

                if(ed_n.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. N: Edificio Departamento de IG, administración y salones para clases", Toast.LENGTH_LONG).show()
                }

                if(ed_h.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. H: Laboratorio de Arquitectura y salones para clases", Toast.LENGTH_LONG).show()
                }

                if(ed_m.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. M: Laboratorios de Quimica", Toast.LENGTH_LONG).show()
                }

                if(ed_aa.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. A: Salones destinados para clases, en cursos de nuevo ingreso ahí ubican a los de Arquitectura", Toast.LENGTH_LONG).show()
                }

                if(ed_gg.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. G: Salones destinados para clases, en cursos de nuevo ingreso ahí estuvimos los de Sistemas Comp.", Toast.LENGTH_LONG).show()
                }

                if(ed_g.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. G: Salones destinados para clases, en cursos de nuevo ingreso ahí estuvimos los de Sistemas Comp.", Toast.LENGTH_LONG).show()
                }

                if(ed_q.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. Q: Laboratorios de Quimica ", Toast.LENGTH_LONG).show()
                }

                if(ed_ee.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. E: Edificio de Extra Excolares, actualmente se encuentran en el DOMO", Toast.LENGTH_LONG).show()
                }

                if(ed_p.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. P: Sala Audiovisual, se realizan diversos eventos, entre ellos entrega de certificados CISCO", Toast.LENGTH_LONG).show()
                }

                if(ed_pp.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. P: Sala Audiovisual, se realizan diversos eventos, entre ellos entrega de certificados CISCO", Toast.LENGTH_LONG).show()
                }

                if(ed_b.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. B: Bodegas de industrial", Toast.LENGTH_LONG).show()
                }

                if(ed_bb.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. B': Laboratorios de Industrial", Toast.LENGTH_LONG).show()
                }

                if(ed_bg.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Entraste al Ed. BG: Ensayan los de la banda de guerra y ahí guardan sus instrumentos jeje", Toast.LENGTH_LONG).show()
                }

                if(balon.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Estas en campo de fútbol No.3", Toast.LENGTH_LONG).show()
                }

                if(balon2.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Estas en campo de fútbol No.2", Toast.LENGTH_LONG).show()
                }

                if(domo.estaEnArea(event.getX(), event.getY())){
                    Toast.makeText(puntero,"Estas en el DOMO, usos multiples, juegos, informes, etc.", Toast.LENGTH_LONG).show()
                }
            }

        }
        return true
    }

}



