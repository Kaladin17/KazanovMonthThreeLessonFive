package com.example.rv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rv2.databinding.ActivityDetailBinding;
import com.example.rv2.recycler.Car;

public class DetailActivity extends AppCompatActivity {

	ActivityDetailBinding binding;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		binding = ActivityDetailBinding.inflate(getLayoutInflater());
		setContentView(binding.getRoot());

		getBundle();
	}

	private void getBundle() {
		if (getIntent() != null) {
			Car car = (Car) getIntent().getSerializableExtra("car");

			binding.tvTextOne.setText(getIntent().getStringExtra("car"));
			System.out.println(car.getImage());
			System.out.println(car.getName());
			System.out.println(car.getDescription());
		}
	}
}