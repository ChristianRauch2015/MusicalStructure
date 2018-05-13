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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Context context, ArrayList<Song> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);
        TextView performerTextView = (TextView) listItemView.findViewById(R.id.performer_text_view);
        performerTextView.setText(currentSong.getNameOfPerformer());
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentSong.getTitleOfSong());
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText("Album: " + currentSong.getNameOfAlbum());
        TextView releaseTextView = listItemView.findViewById(R.id.release_text_view);
        releaseTextView.setText("Released: " + Integer.toString(currentSong.getYearOfRelease()));
        return listItemView;
    }
}
