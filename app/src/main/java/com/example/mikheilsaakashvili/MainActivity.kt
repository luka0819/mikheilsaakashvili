package com.example.mikheilsaakashvili

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    private  lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.reciclerview)


        val mishunia = ArrayList<mishka>()
        mishunia.add(mishka("https://diplomats.pl/wp-content/uploads/2016/03/Mikheil_Saakashvili.jpg"))
        mishunia.add(mishka("https://agenda.ge/files/news/029/1638mikheil-saakashvili-61.jpg"))
        mishunia.add(mishka("https://diplomats.pl/wp-content/uploads/2016/03/Mikheil_Saakashvili.jpg"))
        mishunia.add(mishka("https://report.ge/storage/news/4fdf58060b78a42ad1b6a040a7bf4a3b/3e7f7074-a037-414f-8c4e-949e81dbe18c_640.jpg"))
        mishunia.add(mishka("https://www.georgianjournal.ge/media/_thumb/images/georgianews/2018/November/Saakashvili/saakashvili1.png"))
        mishunia.add(mishka("https://neweasterneurope.eu/new_site/wp-content/uploads/2018/08/9798098113_c3aaf7c24b_z.jpg"))
        mishunia.add(mishka("https://uploads.concordia.net/2015/01/saakashvili-profile-picture-220x220.jpg"))
        mishunia.add(mishka("https://static.independent.co.uk/s3fs-public/thumbnails/image/2009/07/05/00/206564.bin?width=640"))
        mishunia.add(mishka("https://agenda.ge/files/president/saakashvili4.jpg"))
        mishunia.add(mishka("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTDwFIkxNhqT_eTrL0XvPRr4mPkE4k9cWEc1w&usqp=CAU"))
        mishunia.add(mishka("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdXfs13nQclMtMMZ0nQJ2dKxMiT6D3mr69Ag&usqp=CAU"))
        mishunia.add(mishka("https://secure.i.telegraph.co.uk/multimedia/archive/00796/Mikheil-Saakashvili_796140c.jpg"))
        mishunia.add(mishka("https://report.ge/storage/news/b5bb50076a88a2129e6251ce0139b83d/cbba6e67-7541-45b7-a200-1be8c67233bb_640.jpg"))
        mishunia.add(mishka("https://assets.bwbx.io/images/users/iqjWHBFdfxIU/iyktrz0ajNF0/v1/1000x-1.jpg"))
        mishunia.add(mishka("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4EFAyJDIo4uIf90cze1YFz-13C2j07DUd_A&usqp=CAU"))
        mishunia.add(mishka("https://media.gettyimages.com/photos/former-georgian-president-mikheil-saakashvili-looks-on-as-he-stands-picture-id918178446?s=612x612"))
        mishunia.add(mishka("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPDfIrWls-FGixTWM_5GrWEvzUn2w7pBoUkQ&usqp=CAU"))
        mishunia.add(mishka(""))




        mishunia.add(mishka(""))

       val adapter= mishikosadapter(mishunia)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}