/*
* JTerm - a cross-platform terminal
* Copyright (C) 2017 Sergix, NCSGeek
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.

* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.

* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package jterm.command;

import jterm.util.Util;

import java.util.List;
import static jterm.JTerm.logln;

public class Echo {
    // FIXME: echo is not working correctly, for example: > echo $JAVA_HOME
    @Command(name = "echo", minOptions = 1, syntax = "echo [-h] input")
    public static void echo(List<String> options) {
        String info = Util.getAsString(options);
        logln(info.substring(0, info.length() - 1), true);
    }
}
