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

public class Song {

    private String mNameOfPerformer;
    private String mTitleOfSong;
    private String mNameOfAlbum;
    private int mYearOfRelease;

    /**
     * Create a new Song object.
     *
     * @param nameOfPerformer is the name of the group or singer
     * @param titleOfSong     is the title of the song
     * @param nameOfAlbum     is the name of the album of this song if applicable
     * @param yearOfRelease   is the date of release
     */
    public Song(String nameOfPerformer, String titleOfSong, String nameOfAlbum, int yearOfRelease) {
        mNameOfPerformer = nameOfPerformer;
        mTitleOfSong = titleOfSong;
        mNameOfAlbum = nameOfAlbum;
        if (yearOfRelease > 0)
            mYearOfRelease = yearOfRelease;
    }

    /**
     * Get the name of the performer
     *
     * @return name of the performer
     */
    public String getNameOfPerformer() {
        return mNameOfPerformer;
    }

    /**
     * Get the title of the song
     *
     * @return title of song
     */
    public String getTitleOfSong() {
        return mTitleOfSong;
    }

    /**
     * Get the name of the album if applicable
     *
     * @return name of album
     */
    public String getNameOfAlbum() {
        return mNameOfAlbum;
    }

    /**
     * Get the year of release
     *
     * @return year of release
     */
    public int getYearOfRelease() {
        return mYearOfRelease;
    }
}
