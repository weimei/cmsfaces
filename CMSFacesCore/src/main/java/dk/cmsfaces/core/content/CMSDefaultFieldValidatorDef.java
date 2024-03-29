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
/**
 * @brief 
 * 
 */
public class CMSDefaultFieldValidatorDef implements CMSFieldValidatorDef {
    //-------------------------------------------------------------------------
    //              Constructors
    //-------------------------------------------------------------------------

    public CMSDefaultFieldValidatorDef() {        
        validatorClass = "";
        message = "";
    }

    //-------------------------------------------------------------------------
    //              CMSFieldValidatorDef interface
    //-------------------------------------------------------------------------

    //!\name Properties
    //@{
    @Override
    public String getValidatorClass() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setValidatorClass( String newClass ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setMessage( String newMessage ) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    //@}

    //-------------------------------------------------------------------------
    //              Attributes
    //-------------------------------------------------------------------------
    
    //!\name Attributes
    //@{
    private String validatorClass;
    private String message;
    //@}
}
