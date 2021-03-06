/**
 *  Catroid: An on-device visual programming system for Android devices
 *  Copyright (C) 2010-2012 The Catrobat Team
 *  (<http://developer.catrobat.org/credits>)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  An additional term exception under section 7 of the GNU Affero
 *  General Public License, version 3, is available at
 *  http://www.catroid.org/catroid/licenseadditionalterm
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


package org.catrobat.paintroid.command.implementation;

import org.catrobat.paintroid.PaintroidApplication;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;

public class PathCommand extends BaseCommand {
	protected Path mPath;

	public PathCommand(Paint paint, Path path) {
		super(paint);
		if (path != null) {
			mPath = new Path(path);
		}
	}

	@Override
	public void run(Canvas canvas, Bitmap bitmap) {
		if ((canvas == null) || mPath == null) {
			Log.w(PaintroidApplication.TAG, "Object must not be null in PathCommand.");
			return;
		}
		canvas.drawPath(mPath, mPaint);
	}
}
