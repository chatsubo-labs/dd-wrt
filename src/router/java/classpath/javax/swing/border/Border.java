/* Border.java --
   Copyright (C) 2003 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


package javax.swing.border;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;


/**
 * An public interface for decorative or spacing borders around a Component.
 *
 * <p>To reduce memory consumption, several Components may share a
 * single Border instance. {@link javax.swing.BorderFactory} is a
 * factory class for producing commonly used shared borders.
 *
 * @see javax.swing.BorderFactory
 * @see EmptyBorder
 * @see CompoundBorder
 * @see BevelBorder
 * @see EtchedBorder
 * @see LineBorder
 * @see MatteBorder
 * @see SoftBevelBorder
 * @see TitledBorder
 * @see AbstractBorder
 *
 * @author Ronald Veldema (rveldema@cs.vu.nl)
 * @author Michael Koch (konqueror@gmx.de)
 * @author Sascha Brawer (brawer@dandelis.ch)
 */
public interface Border
{
  /**
   * Paints the border for a given component.
   *
   * @param c the component whose border is to be painted.
   * @param g the graphics for painting.
   * @param x the horizontal position for painting the border.
   * @param y the vertical position for painting the border.
   * @param width the width of the available area for painting the border.
   * @param height the height of the available area for painting the border.
   */
  void paintBorder(Component c, Graphics g, int x, int y, int width,
                   int height);

  /**
   * Measures the width of this border.
   *
   * @param c the component whose border is to be measured.
   *
   * @return an Insets object whose <code>left</code>, <code>right</code>,
   *         <code>top</code> and <code>bottom</code> fields indicate the
   *         width of the border at the respective edge.
   */
  Insets getBorderInsets(Component c);

  /**
   * Determines whether this border fills every pixel in its area
   * when painting.
   *
   * @return <code>true</code> if the border is fully opaque, or
   *         <code>false</code> if some pixels of the background
   *         can shine through the border.
   */
  boolean isBorderOpaque();
}
