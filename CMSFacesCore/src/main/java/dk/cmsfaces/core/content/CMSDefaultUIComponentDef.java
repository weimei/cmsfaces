//-----------------------------------------------------------------------------
/*
 * Copyright (C) 2011 sunepoulsen
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//-----------------------------------------------------------------------------
package dk.cmsfaces.core.content;

//-----------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

//-----------------------------------------------------------------------------
/**
 *
 * @author sunepoulsen
 */
public class CMSDefaultUIComponentDef implements CMSUIComponentDef {
    //-------------------------------------------------------------------------
    //              Constructors
    //-------------------------------------------------------------------------
    public CMSDefaultUIComponentDef() {
        componentName = "";
        attributtes = new HashMap();
    }
    
    //-------------------------------------------------------------------------
    //              CMSUIComponentDef interface
    //-------------------------------------------------------------------------

    //!\name Properties
    //@{    
    @Override
    public String getComponentName() {
        return this.componentName;
    }

    @Override
    public void setComponentName( String newName ) throws ClassNotFoundException {
        Class.forName( newName );
        this.componentName = newName;
    }

    @Override
    public Map<String, Object> getAttributtes() {
        return this.attributtes;
    }

    @Override
    public void setAttributtes( Map<String, Object> newAttributtes ) {
        this.attributtes = newAttributtes;
    }
    //@}

    //-------------------------------------------------------------------------
    //              Private section
    //-------------------------------------------------------------------------
    
    //!\name Attributes
    //@{
    String componentName;
    Map<String, Object> attributtes;
    //@}
}
