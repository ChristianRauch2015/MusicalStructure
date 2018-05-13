/**
 * ~ MIT License
 * ~
 * ~ Permission is hereby granted, free of charge, to any person obtaining a copy
 * ~ of this software and associated documentation files (the "Software"), to deal
 * ~ in the Software without restriction, including without limitation the rights
 * ~ to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * ~ copies of the Software, and to permit persons to whom the Software is
 * ~ furnished to do so, subject to the following conditions:
 * ~
 * ~ The above copyright notice and this permission notice shall be included in all
 * ~ copies or substantial portions of the Software.
 * ~
 * ~ THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * ~ IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * ~ FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * ~ AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * ~ LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * ~ OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * ~ SOFTWARE.
 */
package com.example.android.musicalstructure;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String title = extras.getString(getString(R.string.key_title));
            String performer = extras.getString(getString(R.string.key_performer));
            String album = extras.getString(getString(R.string.key_album));
            int release = extras.getInt(getString(R.string.key_released));
            TextView currentPerformer = findViewById(R.id.current_performer);
            TextView currentTitle = findViewById(R.id.current_title);
            TextView currentAlbum = findViewById(R.id.current_album);
            TextView currentRelease = findViewById(R.id.current_release);
            ImageButton current_back = findViewById(R.id.current_back);
            ImageButton current_stop = findViewById(R.id.current_stop);
            ImageButton current_play = findViewById(R.id.current_play);
            currentPerformer.setText(performer);
            currentTitle.setText(title);
            currentAlbum.setText(getString(R.string.album) + album);
            currentRelease.setText(getString(R.string.released) + String.valueOf(release));
            current_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();      //method to turn on
                }
            });
            current_stop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayMessage("TODO");
                }
            });
            current_play.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    displayMessage("TODO");
                }
            });
        }
    }

    /**
     * This method displays the given text
     *
     * @param message to be displayed
     */

    private void displayMessage(String message) {
        Toast.makeText(this, message,
                Toast.LENGTH_LONG).show();
    }
}
