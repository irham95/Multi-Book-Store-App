package example.com.tugasakhir020irham011yuni;

import android.view.View;

import example.com.tugasakhir020irham011yuni.model.Mahasiswa;

/**
 * Written by Irham Nurrahman on 2:03 AM 4/8/2020
 **/
    public class CustomOnItemClickListener implements View.OnClickListener {
        private int position;
        private OnItemClickCallback onItemClickCallback;
        public CustomOnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
            this.position = position;
            this.onItemClickCallback = onItemClickCallback;
        }

        @Override
        public void onClick(View view) {
            onItemClickCallback.onItemClicked(view, position);
        }
        public interface OnItemClickCallback {
            void onItemClicked(View view, int position);

            void onItemClicked(Mahasiswa mahasiswa);
        }
    }

