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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.performer1), getString(R.string.title1), getString(R.string.album1), 1983));
        songs.add(new Song(getString(R.string.performer1), getString(R.string.title2), getString(R.string.album2), 1991));
        songs.add(new Song(getString(R.string.performer2), getString(R.string.title3), getString(R.string.album3), 1989));
        songs.add(new Song(getString(R.string.performer1), getString(R.string.title4), getString(R.string.album4), 1986));
        songs.add(new Song(getString(R.string.performer1), getString(R.string.title5), getString(R.string.album2), 1991));
        songs.add(new Song(getString(R.string.performer2), getString(R.string.title6), getString(R.string.album5), 1999));
        songs.add(new Song(getString(R.string.performer1), getString(R.string.title7), getString(R.string.album4), 1986));
        songs.add(new Song(getString(R.string.performer2), getString(R.string.title8), getString(R.string.album6), 2002));
        songs.add(new Song(getString(R.string.performer1), getString(R.string.title9), getString(R.string.album2), 1991));
        songs.add(new Song(getString(R.string.performer2), getString(R.string.title10), getString(R.string.album3), 1989));

        final SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                String performer = adapter.getItem(position).getNameOfPerformer();
                String title = adapter.getItem(position).getTitleOfSong();
                String album = adapter.getItem(position).getNameOfAlbum();
                int relesase = adapter.getItem(position).getYearOfRelease();
                Intent i = new Intent(MainActivity.this, CurrentSongActivity.class);
                i.putExtra(getString(R.string.key_title), title);
                i.putExtra(getString(R.string.key_performer), performer);
                i.putExtra(getString(R.string.key_album), album);
                i.putExtra(getString(R.string.key_released), relesase);
                startActivity(i);
            }
        });
    }
}
