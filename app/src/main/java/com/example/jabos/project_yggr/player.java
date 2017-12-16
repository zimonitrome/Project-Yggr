package com.example.jabos.project_yggr;

import android.graphics.Rect;
import android.media.Image;

/**
 * Created by jabos on 17-12-16.
 */

public class player {

    player(){
        _inAir = false;
        _timeInAir = 0;
        _posY = 100;

    }

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

    public void jump() {
        if (!_inAir) {
            //jump logic
            _inAir = true;
        }
    }

    public Boolean colision(object Rect) {

        _playerShape.
        return true;
    }

    private short _timeInAir;
    private Rect _playerShape;
    private final Integer _posX = 100;
    private Integer _posY;
    private Boolean _inAir;

}
