package com.example.jabos.project_yggr;

import android.media.Image;

/**
 * Created by jabos on 17-12-16.
 */

public class player {


    public void set_sprite (Image _sprite) {
        this._sprite = _sprite;
    }

    public Image get_sprite () {
        return _sprite;
    }

    public Integer get_posY () {
        return _posY;
    }

    public void set_posY (Integer _posY) {
        this._posY = _posY;
    }


    private Image _sprite;
    private Integer _posY;
}
