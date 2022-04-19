package br.edu.unis.aplicativosmoveis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DisciplinesActivity extends AppCompatActivity {

    RecyclerView rvDisciplines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines);

        rvDisciplines = findViewById(R.id.rv_celulares);
        rvDisciplines.setLayoutManager(new LinearLayoutManager(this));

        List<Discipline> disciplines = new ArrayList<>();
        disciplines.add(new Discipline("Samsung", "A52", "Preto", R.color.teal_200));
        disciplines.add(new Discipline("Motorola", "G5", "Branco", R.color.vermelho));
        disciplines.add(new Discipline("Apple", "iPhoneMax", "Dourado", R.color.purple_700));
        disciplines.add(new Discipline("Nokia", "T20", "Preto", R.color.teal_200));
        disciplines.add(new Discipline("LG", "LGk21", "Azul", R.color.vermelho));


        DisciplinesAdapter adapter = new DisciplinesAdapter(disciplines);
        rvDisciplines.setAdapter(adapter);
    }
}