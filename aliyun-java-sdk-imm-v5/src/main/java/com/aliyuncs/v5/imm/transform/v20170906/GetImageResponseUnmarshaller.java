/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.v5.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.Address;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.CroppingSuggestionItem;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.CroppingSuggestionItem.CroppingBoundary;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.FacesItem;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.FacesItem.EmotionDetails;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.ImageQuality;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.OCRItem;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.OCRItem.OCRBoundary;
import com.aliyuncs.v5.imm.model.v20170906.GetImageResponse.TagsItem;
import com.aliyuncs.v5.transform.UnmarshallerContext;


public class GetImageResponseUnmarshaller {

	public static GetImageResponse unmarshall(GetImageResponse getImageResponse, UnmarshallerContext _ctx) {
		
		getImageResponse.setRequestId(_ctx.stringValue("GetImageResponse.RequestId"));
		getImageResponse.setSetId(_ctx.stringValue("GetImageResponse.SetId"));
		getImageResponse.setImageUri(_ctx.stringValue("GetImageResponse.ImageUri"));
		getImageResponse.setRemarksA(_ctx.stringValue("GetImageResponse.RemarksA"));
		getImageResponse.setRemarksB(_ctx.stringValue("GetImageResponse.RemarksB"));
		getImageResponse.setCreateTime(_ctx.stringValue("GetImageResponse.CreateTime"));
		getImageResponse.setModifyTime(_ctx.stringValue("GetImageResponse.ModifyTime"));
		getImageResponse.setImageWidth(_ctx.integerValue("GetImageResponse.ImageWidth"));
		getImageResponse.setImageHeight(_ctx.integerValue("GetImageResponse.ImageHeight"));
		getImageResponse.setImageFormat(_ctx.stringValue("GetImageResponse.ImageFormat"));
		getImageResponse.setExif(_ctx.stringValue("GetImageResponse.Exif"));
		getImageResponse.setFileSize(_ctx.integerValue("GetImageResponse.FileSize"));
		getImageResponse.setImageTime(_ctx.stringValue("GetImageResponse.ImageTime"));
		getImageResponse.setOrientation(_ctx.stringValue("GetImageResponse.Orientation"));
		getImageResponse.setSourceType(_ctx.stringValue("GetImageResponse.SourceType"));
		getImageResponse.setSourceUri(_ctx.stringValue("GetImageResponse.SourceUri"));
		getImageResponse.setSourcePosition(_ctx.stringValue("GetImageResponse.SourcePosition"));
		getImageResponse.setFacesStatus(_ctx.stringValue("GetImageResponse.FacesStatus"));
		getImageResponse.setFacesModifyTime(_ctx.stringValue("GetImageResponse.FacesModifyTime"));
		getImageResponse.setLocation(_ctx.stringValue("GetImageResponse.Location"));
		getImageResponse.setOCRStatus(_ctx.stringValue("GetImageResponse.OCRStatus"));
		getImageResponse.setOCRModifyTime(_ctx.stringValue("GetImageResponse.OCRModifyTime"));
		getImageResponse.setOCRFailReason(_ctx.stringValue("GetImageResponse.OCRFailReason"));
		getImageResponse.setFacesFailReason(_ctx.stringValue("GetImageResponse.FacesFailReason"));
		getImageResponse.setTagsFailReason(_ctx.stringValue("GetImageResponse.TagsFailReason"));
		getImageResponse.setTagsModifyTime(_ctx.stringValue("GetImageResponse.TagsModifyTime"));
		getImageResponse.setTagsStatus(_ctx.stringValue("GetImageResponse.TagsStatus"));
		getImageResponse.setRemarksC(_ctx.stringValue("GetImageResponse.RemarksC"));
		getImageResponse.setRemarksD(_ctx.stringValue("GetImageResponse.RemarksD"));
		getImageResponse.setExternalId(_ctx.stringValue("GetImageResponse.ExternalId"));
		getImageResponse.setAddressModifyTime(_ctx.stringValue("GetImageResponse.AddressModifyTime"));
		getImageResponse.setAddressStatus(_ctx.stringValue("GetImageResponse.AddressStatus"));
		getImageResponse.setAddressFailReason(_ctx.stringValue("GetImageResponse.AddressFailReason"));
		getImageResponse.setRemarksArrayA(_ctx.stringValue("GetImageResponse.RemarksArrayA"));
		getImageResponse.setRemarksArrayB(_ctx.stringValue("GetImageResponse.RemarksArrayB"));
		getImageResponse.setImageQualityModifyTime(_ctx.stringValue("GetImageResponse.ImageQualityModifyTime"));
		getImageResponse.setImageQualityFailReason(_ctx.stringValue("GetImageResponse.ImageQualityFailReason"));
		getImageResponse.setImageQualityStatus(_ctx.stringValue("GetImageResponse.ImageQualityStatus"));
		getImageResponse.setCroppingSuggestionStatus(_ctx.stringValue("GetImageResponse.CroppingSuggestionStatus"));
		getImageResponse.setCroppingSuggestionFailReason(_ctx.stringValue("GetImageResponse.CroppingSuggestionFailReason"));
		getImageResponse.setCroppingSuggestionModifyTime(_ctx.stringValue("GetImageResponse.CroppingSuggestionModifyTime"));

		ImageQuality imageQuality = new ImageQuality();
		imageQuality.setOverallScore(_ctx.floatValue("GetImageResponse.ImageQuality.OverallScore"));
		imageQuality.setClarityScore(_ctx.floatValue("GetImageResponse.ImageQuality.ClarityScore"));
		imageQuality.setClarity(_ctx.floatValue("GetImageResponse.ImageQuality.Clarity"));
		imageQuality.setExposureScore(_ctx.floatValue("GetImageResponse.ImageQuality.ExposureScore"));
		imageQuality.setExposure(_ctx.floatValue("GetImageResponse.ImageQuality.Exposure"));
		imageQuality.setContrastScore(_ctx.floatValue("GetImageResponse.ImageQuality.ContrastScore"));
		imageQuality.setContrast(_ctx.floatValue("GetImageResponse.ImageQuality.Contrast"));
		imageQuality.setColorScore(_ctx.floatValue("GetImageResponse.ImageQuality.ColorScore"));
		imageQuality.setColor(_ctx.floatValue("GetImageResponse.ImageQuality.Color"));
		imageQuality.setCompositionScore(_ctx.floatValue("GetImageResponse.ImageQuality.CompositionScore"));
		getImageResponse.setImageQuality(imageQuality);

		Address address = new Address();
		address.setAddressLine(_ctx.stringValue("GetImageResponse.Address.AddressLine"));
		address.setCountry(_ctx.stringValue("GetImageResponse.Address.Country"));
		address.setProvince(_ctx.stringValue("GetImageResponse.Address.Province"));
		address.setCity(_ctx.stringValue("GetImageResponse.Address.City"));
		address.setDistrict(_ctx.stringValue("GetImageResponse.Address.District"));
		address.setTownship(_ctx.stringValue("GetImageResponse.Address.Township"));
		getImageResponse.setAddress(address);

		List<CroppingSuggestionItem> croppingSuggestionList = new ArrayList<CroppingSuggestionItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.CroppingSuggestion.Length"); i++) {
			CroppingSuggestionItem croppingSuggestionItem = new CroppingSuggestionItem();
			croppingSuggestionItem.setAspectRatio(_ctx.stringValue("GetImageResponse.CroppingSuggestion["+ i +"].AspectRatio"));
			croppingSuggestionItem.setScore(_ctx.floatValue("GetImageResponse.CroppingSuggestion["+ i +"].Score"));

			CroppingBoundary croppingBoundary = new CroppingBoundary();
			croppingBoundary.setWidth(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Width"));
			croppingBoundary.setHeight(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Height"));
			croppingBoundary.setLeft(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Left"));
			croppingBoundary.setTop(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Top"));
			croppingSuggestionItem.setCroppingBoundary(croppingBoundary);

			croppingSuggestionList.add(croppingSuggestionItem);
		}
		getImageResponse.setCroppingSuggestion(croppingSuggestionList);

		List<FacesItem> facesList = new ArrayList<FacesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFaceId(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceId"));
			facesItem.setFaceConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceConfidence"));
			facesItem.setAge(_ctx.stringValue("GetImageResponse.Faces["+ i +"].Age"));
			facesItem.setGender(_ctx.stringValue("GetImageResponse.Faces["+ i +"].Gender"));
			facesItem.setEmotion(_ctx.stringValue("GetImageResponse.Faces["+ i +"].Emotion"));
			facesItem.setAttractive(_ctx.floatValue("GetImageResponse.Faces["+ i +"].Attractive"));
			facesItem.setGenderConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].GenderConfidence"));
			facesItem.setGroupId(_ctx.stringValue("GetImageResponse.Faces["+ i +"].GroupId"));
			facesItem.setFaceQuality(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceQuality"));
			facesItem.setEmotionConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionConfidence"));

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setGlasses(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setBeard(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Beard"));
			faceAttributes.setMask(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Mask"));
			faceAttributes.setGlassesConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.GlassesConfidence"));
			faceAttributes.setBeardConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.BeardConfidence"));
			faceAttributes.setMaskConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.MaskConfidence"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setLeft(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceBoundary.setTop(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary.setWidth(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary.setHeight(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceAttributes.setFaceBoundary(faceBoundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Pitch"));
			headPose.setRoll(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Roll"));
			headPose.setYaw(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Yaw"));
			faceAttributes.setHeadPose(headPose);
			facesItem.setFaceAttributes(faceAttributes);

			EmotionDetails emotionDetails = new EmotionDetails();
			emotionDetails.setHAPPY(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.HAPPY"));
			emotionDetails.setSAD(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SAD"));
			emotionDetails.setANGRY(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.ANGRY"));
			emotionDetails.setSURPRISED(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SURPRISED"));
			emotionDetails.setSCARED(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SCARED"));
			emotionDetails.setDISGUSTED(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.DISGUSTED"));
			emotionDetails.setCALM(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.CALM"));
			facesItem.setEmotionDetails(emotionDetails);

			facesList.add(facesItem);
		}
		getImageResponse.setFaces(facesList);

		List<OCRItem> oCRList = new ArrayList<OCRItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.OCR.Length"); i++) {
			OCRItem oCRItem = new OCRItem();
			oCRItem.setOCRContents(_ctx.stringValue("GetImageResponse.OCR["+ i +"].OCRContents"));
			oCRItem.setOCRConfidence(_ctx.floatValue("GetImageResponse.OCR["+ i +"].OCRConfidence"));

			OCRBoundary oCRBoundary = new OCRBoundary();
			oCRBoundary.setLeft(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Left"));
			oCRBoundary.setTop(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Top"));
			oCRBoundary.setWidth(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Width"));
			oCRBoundary.setHeight(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Height"));
			oCRItem.setOCRBoundary(oCRBoundary);

			oCRList.add(oCRItem);
		}
		getImageResponse.setOCR(oCRList);

		List<TagsItem> tagsList = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(_ctx.stringValue("GetImageResponse.Tags["+ i +"].TagName"));
			tagsItem.setTagConfidence(_ctx.floatValue("GetImageResponse.Tags["+ i +"].TagConfidence"));
			tagsItem.setTagLevel(_ctx.integerValue("GetImageResponse.Tags["+ i +"].TagLevel"));
			tagsItem.setParentTagName(_ctx.stringValue("GetImageResponse.Tags["+ i +"].ParentTagName"));

			tagsList.add(tagsItem);
		}
		getImageResponse.setTags(tagsList);
	 
	 	return getImageResponse;
	}
}